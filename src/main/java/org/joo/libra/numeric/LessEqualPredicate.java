package org.joo.libra.numeric;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public class LessEqualPredicate extends BinaryPredicate<Number, Number> {

    public LessEqualPredicate(HasValue<Number> one, HasValue<Number> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(Number one, Number other) {
        return NumericComparator.compare(one, other) <= 0;
    }
}
