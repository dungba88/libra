package org.joo.libra.support.eval.impl;

import org.joo.libra.support.eval.ExpressionBuilder;

public class SimpleExpressionBuilder implements ExpressionBuilder {

    @Override
    public String build(Object obj, String root, String variableName) {
        return root + "." + variableName;
    }
}
