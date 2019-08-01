package org.joo.libra.support.eval.impl;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Map;

import org.joo.libra.support.eval.ExpressionBuilder;

public class ResolvedExpressionBuilder implements ExpressionBuilder {

    @Override
    public String build(Object obj, String root, String variableName) throws Exception {
        return root + buildWithPojo(obj, variableName);
    }

    private String buildWithPojo(Object obj, String variableName) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class<?> currentType = obj.getClass();
        String[] frags = variableName.split("\\.");
        for (String frag : frags) {
            if (Map.class.isAssignableFrom(currentType)) {
                throw new UnsupportedOperationException("Map is not supported, but found on: " + frag);
            }

            int indexed = frag.indexOf('[');

            String fieldName = indexed == -1 ? frag : frag.substring(0, indexed);
            Method method = tryWithGetter(currentType, fieldName);
            sb.append("." + method.getName() + "()");

            Class<?> parentType = currentType;
            currentType = method.getReturnType();

            if (indexed != -1) {
                boolean isArray = Object[].class.isAssignableFrom(currentType);

                sb.append(extractIndexedPart(isArray, frag, indexed));

                currentType = isArray ? currentType.getComponentType()
                        : determineItemTypeForList(parentType, fieldName);
            }
        }
        return sb.toString();
    }

    private Class<?> determineItemTypeForList(Class<?> currentType, String fieldName)
            throws NoSuchFieldException, SecurityException, ClassNotFoundException {
        ParameterizedType type = (ParameterizedType) currentType.getDeclaredField(fieldName).getGenericType();
        return Class.forName(type.getActualTypeArguments()[0].getTypeName());
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
