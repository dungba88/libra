package org.joo.libra.support.eval;

import org.joo.libra.support.ObjectUtils;

public class DefaultVariableEvaluator implements VariableEvaluator {

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {
        return ObjectUtils.getValue(obj, variableName);
    }
}
