package org.joo.libra.text;

import java.util.Arrays;
import java.util.Collection;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

@SuppressWarnings("rawtypes")
public class ContainPredicate extends BinaryPredicate {

    @SuppressWarnings("unchecked")
    public ContainPredicate(HasValue<?> one, HasValue<?> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(Object one, Object other) {
        if (one instanceof String && other instanceof String)
            return one.toString().contains(other.toString());
        if (one instanceof Collection<?>)
            return ((Collection<?>) one).contains(other);
        if (one instanceof Object[]) {
            return Arrays.asList((Object[]) one).contains(other);
        }
        return false;
    }
}
