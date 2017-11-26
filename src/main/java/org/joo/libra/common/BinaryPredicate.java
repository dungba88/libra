package org.joo.libra.common;

import org.joo.libra.PredicateContext;

public abstract class BinaryPredicate<T, H> implements CompositionPredicate {

    private HasValue<T> one;

    private HasValue<H> other;

    public BinaryPredicate(final HasValue<T> one, final HasValue<H> other) {
        this.one = one;
        this.other = other;
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) {
        T theOne = one != null ? one.getValue(context) : null;
        H theOther = other != null ? other.getValue(context) : null;
        if (theOne == null && theOther == null)
            return true;
        if (theOne == null || theOther == null)
            return false;
        return doSatisifiedBy(theOne, theOther);
    }

    protected abstract boolean doSatisifiedBy(T one, H other);
}
