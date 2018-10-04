package org.joo.libra.sql.node;

import lombok.Data;

@Data
public abstract class InfixExpressionNode implements ExpressionNode {

	private ExpressionNode left;

	private ExpressionNode right;
}