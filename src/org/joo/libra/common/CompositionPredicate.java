package org.joo.libra.common;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.logic.OrPredicate;

public abstract class CompositionPredicate implements Predicate {

	public Predicate And(Predicate other) {
		return new AndPredicate(this, other);
	}

	public Predicate Or(Predicate other) {
		return new OrPredicate(this, other);
	}

	public Predicate Not() {
		return new NotPredicate(this);
	}
}
