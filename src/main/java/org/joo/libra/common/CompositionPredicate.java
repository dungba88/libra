package org.joo.libra.common;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.logic.OrPredicate;

public abstract class CompositionPredicate implements Predicate {

    public Predicate and(Predicate other) {
        return new AndPredicate(this, other);
    }

    public Predicate or(Predicate other) {
        return new OrPredicate(this, other);
    }

    public Predicate not() {
        return new NotPredicate(this);
    }
}
