package org.joo.libra.text;

import java.util.Arrays;
import java.util.Collection;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.support.ListUtils;

/**
 * Represents a general <code>contains</code> predicate. It supports
 * <code>String</code>, <code>Collection</code> or <code>Array</code>.
 * 
 * @author griever
 *
 */
@SuppressWarnings("rawtypes")
public class ContainPredicate extends BinaryPredicate {

    @SuppressWarnings("unchecked")
    public ContainPredicate(final HasValue<?> one, final HasValue<?> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Object one, final Object other) {
        if (one instanceof String)
            return one.toString().contains(other.toString());
        if (one instanceof Collection<?>)
            return ListUtils.contains((Collection<?>) one, other);
        if (one instanceof Object[])
            return ListUtils.contains(Arrays.asList((Object[]) one), other);
        return false;
    }
}
