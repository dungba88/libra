package org.joo.libra.logic;

import java.util.Arrays;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

/**
 * Represents a predicate with <code>or</code> rule. It will be satisfied by if
 * and only if any of the child predicates is satisfied. If the child is empty,
 * it will always return true.
 * 
 * @author griever
 *
 */
public class OrPredicate implements CompositionPredicate {

    private Predicate[] predicates;

    public OrPredicate(final Predicate... predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        if (predicates.length == 0)
            return true;
        for (Predicate predicate : predicates) {
            if (predicate.satisfiedBy(context))
                return true;
        }
        return false;
    }

    public String toString() {
		String[] predicatesAsString = Arrays.stream(predicates).map(p -> p.toString())
				.toArray(size -> new String[size]);
    	return "OR(" + String.join(", ", predicatesAsString) + ")";
    }
    
    public Predicate[] getPredicates() {
    	return predicates;
    }
}
