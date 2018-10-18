package org.joo.libra.common;

import java.util.function.Function;

import org.joo.libra.LiteralPredicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.support.exceptions.PredicateExecutionException;

/**
 * Simple implementation of {@link org.joo.libra.Predicate}
 * 
 * @author griever
 *
 */
public class DerivedLiteralPredicate<T> implements CompositionPredicate, LiteralPredicate<T> {

	private final HasValue<T> literalValue;
	
	private final Function<T, Boolean> predicateFunction;

	public DerivedLiteralPredicate(final HasValue<T> literalValue, final Function<T, Boolean> predicateFunction) {
		this.literalValue = literalValue;
		this.predicateFunction = predicateFunction;
	}
	
	@Override
	public T calculateLiteralValue(final PredicateContext context) throws PredicateExecutionException {
		return literalValue.getValue(context);
	}

	@Override
	public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
		return predicateFunction.apply(literalValue.getValue(context));
	}

	public String toString() {
		return literalValue + "";
	}
}
