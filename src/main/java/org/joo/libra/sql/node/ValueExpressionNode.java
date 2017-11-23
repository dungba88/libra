package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.common.SimplePredicate;

public class ValueExpressionNode<T> implements ExpressionNode, HasValue<T> {
	
	protected T value;

	@Override
	public T getValue(PredicateContext context) {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public Predicate buildPredicate() {
		return new SimplePredicate(value != null);
	}
	
	@Override
	public ExpressionNode[] getChildren() {
		return null;
	}
}