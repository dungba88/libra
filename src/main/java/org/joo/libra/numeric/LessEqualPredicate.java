package org.joo.libra.numeric;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents a numeric <code>less than or equals to</code> predicate
 * 
 * @author griever
 *
 */
public class LessEqualPredicate extends BinaryPredicate<Number, Number> {

    public LessEqualPredicate(final HasValue<Number> one, final HasValue<Number> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Number one, final Number other) {
        return NumericComparator.compare(one, other) <= 0;
    }
}
