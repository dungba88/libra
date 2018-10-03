package org.joo.libra.pointer;

import java.util.Collection;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents an expression variable. The evaluation will be based on the following rules:
 * - A string variable will be considered as true if and only if it's not null and not empty
 * - A number variable will be considered as true if and only if it's not null and not zero
 * - A boolean variable will be considered as its value
 * - Any other variable be considered as true if and only if it's not null
 * 
 * @author griever
 *
 */
public class VariablePredicate implements CompositionPredicate {

    private HasValue<Object> value;

    public VariablePredicate(final HasValue<Object> value) {
        this.value = value;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) {
        Object rawValue = value.getValue(context);
        if (rawValue == null)
        	return false;
        if (rawValue instanceof String)
        	return !((String)rawValue).isEmpty();
        if (rawValue instanceof Number)
        	return ((Number) rawValue).doubleValue() != 0.0;
        if (rawValue instanceof Boolean)
        	return Boolean.TRUE.equals(rawValue);
        if (rawValue instanceof Collection)
        	return !((Collection<?>) rawValue).isEmpty();
        if (rawValue instanceof Object[])
        	return ((Object[]) rawValue).length != 0;
        return true;
    }
    
    public String toString() {
    	return "VAR(" + value + ")";
    }
}
