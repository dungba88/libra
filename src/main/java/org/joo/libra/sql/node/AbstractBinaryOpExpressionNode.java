package org.joo.libra.sql.node;

import org.joo.libra.common.HasValue;

import lombok.Data;

@Data
public abstract class AbstractBinaryOpExpressionNode<T extends HasValue<?>> implements ExpressionNode {

	private T left;

	private T right;

	private int op;
}