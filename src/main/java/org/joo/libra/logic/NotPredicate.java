package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

public class NotPredicate extends CompositionPredicate {

    private Predicate predicate;

    public NotPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
        return !predicate.satisfiedBy(context);
    }
}
