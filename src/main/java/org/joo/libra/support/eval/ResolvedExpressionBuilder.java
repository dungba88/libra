package org.joo.libra.support.eval;

import java.lang.reflect.Method;
import java.util.Map;

import org.joo.libra.support.annotations.Itemtype;

public class ResolvedExpressionBuilder<T> implements ExpressionBuilder {

    private Class<T> type;

    public ResolvedExpressionBuilder(Class<T> type) {
        this.type = type;
    }

    @Override
    public String build(Object obj, String root, String variableName) throws Exception {
        if (Map.class.isAssignableFrom(type))
            return root + buildWithMap(variableName);
        return root + buildWithPojo(obj, variableName);
    }

    private String buildWithPojo(Object obj, String variableName) throws SecurityException, NoSuchMethodException {
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

            Method method = tryWithGetter(currentType, capitalized);
            Class<?> tmp = method.getReturnType();
            sb.append("." + method.getName() + "()");

            currentType = tmp;

            if (indexed != -1) {
                boolean isArray = Object[].class.isAssignableFrom(currentType);
                String indexedPart = extractIndexedPart(isArray, oldFrag, indexed);
                sb.append(indexedPart);
                if (isArray) {
                    currentType = currentType.getComponentType();
                } else {
                    currentType = determineItemTypeForList(method);
                }
            }
        }
        return sb.toString();
    }

    private Class<?> determineItemTypeForList(Method method) {
        Itemtype itemType = method.getAnnotation(Itemtype.class);
        if (itemType == null)
            throw new IllegalArgumentException("Getter method which returns non-array collection must be annotated with @ItemType: " + method.getName());
        return itemType.value();
    }

    private Method tryWithGetter(Class<?> currentType, String capitalized)
            throws SecurityException, NoSuchMethodException {
        try {
            return currentType.getMethod("get" + capitalized);
        } catch (NoSuchMethodException e) {
            return currentType.getMethod("is" + capitalized);
        }
    }

    protected String extractIndexedPart(boolean isArray, String oldFrag, int indexed) {
        return isArray ? oldFrag.substring(indexed)
                : ".get(" + oldFrag.substring(indexed + 1, oldFrag.length() - 1) + ")";
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
