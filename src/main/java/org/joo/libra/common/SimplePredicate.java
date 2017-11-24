package org.joo.libra.common;

import org.joo.libra.PredicateContext;
import org.joo.libra.support.PredicateExecutionException;

public class SimplePredicate extends CompositionPredicate {

    private final boolean value;

    public SimplePredicate(boolean value) {
        this.value = value;
    }

    @Override
    public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
        return value;
    }
}
