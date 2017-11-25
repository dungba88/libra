package org.joo.libra.sql.node;

public abstract class UnaryExpressionNode implements ExpressionNode {

    private ExpressionNode innerNode;

    public ExpressionNode getInnerNode() {
        return innerNode;
    }

    public void setInnerNode(final ExpressionNode innerNode) {
        this.innerNode = innerNode;
    }
}