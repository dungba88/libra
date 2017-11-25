package org.joo.libra.pointer;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

public class IsNullPredicate extends CompositionPredicate {

    private HasValue<Object> value;

    public IsNullPredicate(final HasValue<Object> value) {
        this.value = value;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) {
        return value.getValue(context) == null;
    }
}
