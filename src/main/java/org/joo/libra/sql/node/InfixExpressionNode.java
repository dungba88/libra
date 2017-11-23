package org.joo.libra.sql.node;

public abstract class InfixExpressionNode implements ExpressionNode {
	
	private ExpressionNode left;

	private ExpressionNode right;

	public ExpressionNode getLeft() {
		return left;
	}

	public void setLeft(ExpressionNode left) {
		this.left = left;
	}

	public ExpressionNode getRight() {
		return right;
	}

	public void setRight(ExpressionNode right) {
		this.right = right;
	}
}