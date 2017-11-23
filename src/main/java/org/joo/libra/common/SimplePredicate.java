package org.joo.libra.common;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.support.PredicateExecutionException;

public class SimplePredicate implements Predicate {
	
	private final boolean value;
	
	public SimplePredicate(boolean value) {
		this.value = value;
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
		return value;
	}
}
