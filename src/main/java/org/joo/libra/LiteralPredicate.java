package org.joo.libra;

import org.joo.libra.PredicateContext;
import org.joo.libra.support.exceptions.PredicateExecutionException;

public interface LiteralPredicate<T> {

	public T calculateLiteralValue(final PredicateContext context) throws PredicateExecutionException;
}
