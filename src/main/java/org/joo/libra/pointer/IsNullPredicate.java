package org.joo.libra.pointer;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents a <code>is null</code> predicate. It will be satisfied if and only
 * if the given value is null.
 * 
 * @author griever
 *
 */
public class IsNullPredicate implements CompositionPredicate {

    private HasValue<Object> value;

    public IsNullPredicate(final HasValue<Object> value) {
        this.value = value;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) {
        return value.getValue(context) == null;
    }
    
    public String toString() {
    	return "IS_NULL(" + value + ")";
    }
}
