package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

public class NotPredicate implements CompositionPredicate {

    private Predicate predicate;

    public NotPredicate(final Predicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        return !predicate.satisfiedBy(context);
    }
}
