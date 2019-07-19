package org.joo.libra.support.eval;

public class DefaultExpressionBuilder implements ExpressionBuilder {

    @Override
    public String build(String root, String variableName) {
        return root + "." + variableName;
    }
}
