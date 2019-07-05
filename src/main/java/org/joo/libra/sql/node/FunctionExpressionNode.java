package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasList;
import org.joo.libra.common.HasValue;
import org.joo.libra.pointer.VariablePredicate;
import org.joo.libra.support.functions.GlobalFunctions;
import org.joo.libra.support.functions.MultiArgsFunction;

import lombok.Data;

@Data
public class FunctionExpressionNode implements ExpressionNode, HasValue<Object> {

	private String name;

	private HasList inner;

	@Override
	public Predicate buildPredicate() {
		return new VariablePredicate(this);
	}

	@Override
	public Object getValue(final PredicateContext context) {
		MultiArgsFunction handler = getHandler(context);
		Object[] args = getArgs(context);
		return handler.apply(context, args);
	}

	private MultiArgsFunction getHandler(final PredicateContext context) {
		MultiArgsFunction handler = context != null ? context.getRegisteredFunction(name) : null;
		if (handler != null)
			return handler;
		handler = GlobalFunctions.getInstance().getRegisteredFunction(name);
		if (handler == null)
			throw new IllegalArgumentException("Function " + name + " is not defined");
		return handler;
	}

	public Object[] getArgs(final PredicateContext context) {
		if (inner == null)
			return new Object[0];
		return inner.getValueAsArray(context);
	}

	public String toString() {
		return name + "(" + inner + ")";
	}
}