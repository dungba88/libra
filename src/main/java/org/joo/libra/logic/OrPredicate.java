package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

public class OrPredicate extends CompositionPredicate {

    private Predicate[] predicates;

    public OrPredicate(Predicate... predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
        if (predicates == null || predicates.length == 0)
            return true;
        for (Predicate predicate : predicates) {
            if (predicate.satisfiedBy(context))
                return true;
        }
        return false;
    }
}
