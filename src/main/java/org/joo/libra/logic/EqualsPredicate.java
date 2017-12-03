package org.joo.libra.logic;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.numeric.NumericComparator;

/**
 * Represents a 'equal' predicate. It is used to check if both objects are equal
 * to each other. If both object are <code>Number</code>, they will be converted
 * to {@link java.math.BigDecimal} before comparing, so <code>5</code>,
 * <code>5.0</code> and <code>5L</code> are equally. Otherwise they will be
 * compared using <code>equals</code> method.
 * 
 * @author griever
 *
 */
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
