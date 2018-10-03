package org.joo.libra.common;

import org.joo.libra.PredicateContext;
import org.joo.libra.support.PredicateExecutionException;

/**
 * Simple implementation of {@link org.joo.libra.Predicate}
 * 
 * @author griever
 *
 */
public class SimplePredicate implements CompositionPredicate {

    private final boolean value;

    public SimplePredicate(final boolean value) {
        this.value = value;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        return value;
    }
    
    public String toString() {
    	return value + "";
    }
}
