package org.joo.libra.support.eval;

import java.lang.reflect.Method;
import java.util.Map;

public class ResolvedExpressionBuilder<T> implements ExpressionBuilder {

    private Class<T> type;

    public ResolvedExpressionBuilder(Class<T> type) {
        this.type = type;
    }

    @Override
    public String build(String root, String variableName) throws Exception {
        if (Map.class.isAssignableFrom(type))
            return root + buildWithMap(variableName);
        return root + buildWithPojo(variableName);
    }

    private String buildWithPojo(String variableName) throws SecurityException, NoSuchMethodException {
        StringBuilder sb = new StringBuilder();
        Class<?> currentType = type;
        String[] frags = variableName.split("\\.");
        for (String frag : frags) {
            String oldFrag = frag;
            int indexed = frag.indexOf('[');
            if (indexed != -1) {
                frag = frag.substring(0, indexed);
            }

            String capitalized = capitalize(frag);

            Class<?> tmp;
            try {
                tmp = currentType.getDeclaredField(frag).getType();
            } catch (NoSuchFieldException e) {
                tmp = tryWithGetter(currentType, capitalized);
            }
            String indexedPart = extractIndexedPart(tmp, oldFrag, indexed);

            String methodPrefix = "get";

            if (Boolean.class.isAssignableFrom(tmp) || boolean.class.isAssignableFrom(tmp)) {
                methodPrefix = getPrefixForBoolean(currentType, capitalized);
            }

            sb.append("." + methodPrefix + capitalized + "()");

            if (indexedPart != null)
                sb.append(indexedPart);

            currentType = tmp;
        }
        return sb.toString();
    }

    private Class<?> tryWithGetter(Class<?> currentType, String capitalized)
            throws NoSuchMethodException, SecurityException {
        Method method = currentType.getMethod("get" + capitalized);
        return method.getReturnType();
    }

    private String getPrefixForBoolean(Class<?> currentType, String capitalized) {
        try {
            currentType.getMethod("is" + capitalized);
            return "is";
        } catch (NoSuchMethodException | SecurityException e) {
            return "get";
        }
    }

    protected String extractIndexedPart(Class<?> currentType, String oldFrag, int indexed) {
        String indexedPart = null;
        if (indexed != -1) {
            boolean isArray = Object[].class.isAssignableFrom(currentType);
            indexedPart = isArray ? oldFrag.substring(indexed)
                    : ".get(" + oldFrag.substring(indexed + 1, oldFrag.length() - 1) + ")";
        }
        return indexedPart;
    }

    protected String capitalize(String frag) {
        return frag.substring(0, 1).toUpperCase() + frag.substring(1);
    }

    private String buildWithMap(String variableName) {
        StringBuilder sb = new StringBuilder();
        String[] frags = variableName.split("\\.");
        for (String frag : frags) {
            sb.append(".get(\"" + frag + "\")");
        }
        return sb.toString();
    }
}
