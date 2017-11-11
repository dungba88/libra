package org.joo.libra;

import org.joo.libra.support.PredicateExecutionException;

public interface Predicate {

	public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException;
}
