package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

/**
 * Represents a predicate with <code>and</code> rule. It will be satisfied by if
 * and only if all of the child predicates are satisfied. If the child is empty,
 * it will always return true.
 * 
 * @author griever
 *
 */
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
