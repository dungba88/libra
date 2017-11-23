package org.joo.libra.sql.node;

import org.joo.libra.common.HasValue;

public abstract class AbstractBinaryOpExpressionNode<T extends HasValue<?>> implements ExpressionNode {

	private T left;
	
	private T right;
	
	private int op;

	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public T getRight() {
		return right;
	}

	public void setRight(T right) {
		this.right = right;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
	
	@Override
	public ExpressionNode[] getChildren() {
		return new ExpressionNode[] {(ExpressionNode) left, (ExpressionNode) right};
	}
}