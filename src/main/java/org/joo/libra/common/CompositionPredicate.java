package org.joo.libra.common;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.logic.OrPredicate;

public interface CompositionPredicate extends Predicate {

    public default Predicate and(final Predicate other) {
        return new AndPredicate(this, other);
    }

    public default Predicate or(final Predicate other) {
        return new OrPredicate(this, other);
    }

    public default Predicate not() {
        return new NotPredicate(this);
    }
}
