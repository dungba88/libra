package org.joo.libra.support.eval.impl;

import org.joo.libra.support.ObjectUtils;
import org.joo.libra.support.eval.VariableEvaluator;

public class DefaultVariableEvaluator implements VariableEvaluator {

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {
        return ObjectUtils.getValue(obj, variableName);
    }
}
