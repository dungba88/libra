package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimpleLiteralPredicate;

public class ObjectExpressionNode extends ValueExpressionNode<Object> {

	@Override
	public Predicate buildPredicate() {
		return new SimpleLiteralPredicate<Object>(value, value != null);
	}

	public String toString() {
		return value + "";
	}
}
