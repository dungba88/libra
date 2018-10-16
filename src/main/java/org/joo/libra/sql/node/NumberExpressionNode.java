package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimpleLiteralPredicate;
import org.joo.libra.support.NumericComparator;

public class NumberExpressionNode extends ValueExpressionNode<Number> {

	public NumberExpressionNode() {

	}

	public NumberExpressionNode(final Number value) {
		this.value = value;
	}

	@Override
	public Predicate buildPredicate() {
		return new SimpleLiteralPredicate<Number>(value, value != null && NumericComparator.compare(value, 0) != 0);
	}

	public String toString() {
		return value + "";
	}
}