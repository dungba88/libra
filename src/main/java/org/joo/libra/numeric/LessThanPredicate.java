package org.joo.libra.numeric;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public class LessThanPredicate extends BinaryPredicate<Number, Number> {

    public LessThanPredicate(final HasValue<Number> one, final HasValue<Number> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Number one, final Number other) {
        return NumericComparator.compare(one, other) < 0;
    }
}
