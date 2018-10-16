package org.joo.libra.common;

import org.joo.libra.LiteralPredicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.support.exceptions.PredicateExecutionException;

/**
 * Simple implementation of {@link org.joo.libra.Predicate}
 * 
 * @author griever
 *
 */
public class SimpleLiteralPredicate<T> implements CompositionPredicate, LiteralPredicate<T> {

	private final T literalValue;
	
	private final boolean predicateValue;

	public SimpleLiteralPredicate(T literalValue, boolean predicateValue) {
		this.literalValue = literalValue;
		this.predicateValue = predicateValue;
	}
	
	public T calculateLiteralValue(final PredicateContext context) throws PredicateExecutionException {
		return literalValue;
	}

	@Override
	public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
		return predicateValue;
	}

	public String toString() {
		return literalValue + "";
	}
}
