package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;

public class AndPredicate extends CompositionPredicate {

	private Predicate[] predicates;

	@SafeVarargs
	public AndPredicate(Predicate... predicates) {
		this.predicates = predicates;
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) {
		if (predicates == null) return true;
		for(Predicate predicate : predicates) {
			if (!predicate.satisfiedBy(context))
				return false;
		}
		return true;
	}
}
