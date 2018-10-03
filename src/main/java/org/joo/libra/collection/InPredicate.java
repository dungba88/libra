package org.joo.libra.collection;

import java.util.Collection;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

/**
 * A predicate to check if one object is contained by another collection. It
 * will use Java built-in <code>contains</code> method of
 * {@link java.util.Collection}
 * 
 * @author griever
 *
 */
public class InPredicate extends BinaryPredicate<Object, Collection<?>> {

    public InPredicate(final HasValue<Object> one, final HasValue<Collection<?>> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Object one, final Collection<?> other) {
        return other.contains(one);
    }
}
