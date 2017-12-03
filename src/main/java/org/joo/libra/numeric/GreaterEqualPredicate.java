package org.joo.libra.numeric;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents a numeric <code>greater than or equals to</code> predicate
 * 
 * @author griever
 *
 */
public class GreaterEqualPredicate extends BinaryPredicate<Number, Number> {

    public GreaterEqualPredicate(final HasValue<Number> one, final HasValue<Number> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Number one, final Number other) {
        return NumericComparator.compare(one, other) >= 0;
    }
}
