package org.joo.libra.sql.node;

import org.joo.libra.common.HasValue;

public abstract class AbstractBinaryOpExpressionNode<T extends HasValue<?>> implements ExpressionNode {

    private T left;

    private T right;

    private int op;

    public T getLeft() {
        return left;
    }

    public void setLeft(final T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(final T right) {
        this.right = right;
    }

    public int getOp() {
        return op;
    }

    public void setOp(final int op) {
        this.op = op;
    }
}