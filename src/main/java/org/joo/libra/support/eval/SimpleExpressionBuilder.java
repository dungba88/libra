package org.joo.libra.support.eval;

public class SimpleExpressionBuilder implements ExpressionBuilder {

    @Override
    public String build(Object obj, String root, String variableName) {
        return root + "." + variableName;
    }
}
