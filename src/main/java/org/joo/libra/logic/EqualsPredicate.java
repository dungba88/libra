package org.joo.libra.logic;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.numeric.NumericComparator;

@SuppressWarnings("rawtypes")
public class EqualsPredicate extends BinaryPredicate {

    @SuppressWarnings("unchecked")
    public EqualsPredicate(final HasValue<?> one, final HasValue<?> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Object one, final Object other) {
        if (one instanceof Number && other instanceof Number) {
            return NumericComparator.compare((Number) one, (Number) other) == 0;
        }
        return one.equals(other);
    }
}
