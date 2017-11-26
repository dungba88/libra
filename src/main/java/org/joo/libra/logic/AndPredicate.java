package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

public class AndPredicate implements CompositionPredicate {

    private Predicate[] predicates;

    @SafeVarargs
    public AndPredicate(final Predicate... predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        for (Predicate predicate : predicates) {
            if (!predicate.satisfiedBy(context))
                return false;
        }
        return true;
    }
}
