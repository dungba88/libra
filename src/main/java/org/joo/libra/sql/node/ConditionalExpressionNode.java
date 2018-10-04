package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.pointer.VariablePredicate;

import lombok.Data;

@Data
public class ConditionalExpressionNode implements ExpressionNode, HasValue<Object> {

	private ExpressionNode main;

	private HasValue<Object> left;

	private HasValue<Object> right;

	private Predicate mainPredicate;

	@Override
	public Predicate buildPredicate() {
		return new VariablePredicate(this);
	}

	@Override
	public Object getValue(final PredicateContext context) {
		if (mainPredicate == null)
			mainPredicate = main.buildPredicate();
		boolean satisfied = mainPredicate.satisfiedBy(context);
		return satisfied ? left.getValue(context) : right.getValue(context);
	}
}