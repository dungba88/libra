package org.joo.libra.support;

public class DefaultVariableEvaluator implements VariableEvaluator {

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {
        return ObjectUtils.getValue(obj, variableName);
    }
}
