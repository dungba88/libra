package org.joo.libra.text;

import java.util.Collection;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents a <code>is empty</code> predicate. It supports
 * <code>String</code>, <code>Collection</code> and <code>Array</code>. Also if
 * the value is null, it will always return true regardless of the type.
 * 
 * @author griever
 *
 */
public class IsEmptyPredicate implements CompositionPredicate {

    private HasValue<?> value;

    public IsEmptyPredicate(final HasValue<?> value) {
        this.value = value;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean satisfiedBy(final PredicateContext context) {
        Object rawValue = value.getValue(context);
        if (rawValue == null)
            return true;
        if (rawValue instanceof String)
            return rawValue.toString().isEmpty();
        if (rawValue instanceof Collection)
            return ((Collection) rawValue).isEmpty();
        if (rawValue instanceof Object[])
            return ((Object[]) rawValue).length == 0;
        return false;
    }
    
    public String toString() {
    	return "IS_EMPTY(" + value + ")";
    }
}
