package org.joo.libra.sql.node;

import org.joo.libra.common.HasValue;

import lombok.Data;

@Data
public abstract class AbstractUnaryOpExpressionNode<T extends HasValue<?>> implements ExpressionNode {

	private T inner;

	private int op;
}