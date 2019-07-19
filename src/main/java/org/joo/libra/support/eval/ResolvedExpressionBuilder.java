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
        return root + buildWithPojo(obj, variableName);
    }

    private String buildWithPojo(Object obj, String variableName) throws SecurityException, NoSuchMethodException {
        StringBuilder sb = new StringBuilder();
        Class<?> currentType = type;
        String[] frags = variableName.split("\\.");
        for (String frag : frags) {
            if (Map.class.isAssignableFrom(currentType)) {
                throw new UnsupportedOperationException("Map is not supported, but found on: " + frag);
            }

            int indexed = frag.indexOf('[');
            
            String fieldName = indexed == -1 ? frag : frag.substring(0, indexed);
            Method method = tryWithGetter(currentType, fieldName);
            currentType = method.getReturnType();
            sb.append("." + method.getName() + "()");

            if (indexed != -1) {
                boolean isArray = Object[].class.isAssignableFrom(currentType);

                sb.append(extractIndexedPart(isArray, frag, indexed));

                currentType = isArray ? currentType.getComponentType() : determineItemTypeForList(method);
            }
        }
        return sb.toString();
    }

    private Class<?> determineItemTypeForList(Method method) {
        Itemtype itemType = method.getAnnotation(Itemtype.class);
        if (itemType == null) {
            throw new IllegalArgumentException(
                    "Getter method which returns non-array collection must be annotated with @ItemType: "
                            + method.getName());
        }
        return itemType.value();
    }

    private Method tryWithGetter(Class<?> currentType, String frag) throws SecurityException, NoSuchMethodException {
        String capitalized = capitalize(frag);
        try {
            return currentType.getMethod("get" + capitalized);
        } catch (NoSuchMethodException e) {
            return currentType.getMethod("is" + capitalized);
        }
    }

    private String extractIndexedPart(boolean isArray, String oldFrag, int indexed) {
        return isArray ? oldFrag.substring(indexed)
                : ".get(" + oldFrag.substring(indexed + 1, oldFrag.length() - 1) + ")";
    }

    private String capitalize(String frag) {
        return frag.substring(0, 1).toUpperCase() + frag.substring(1);
    }
}
