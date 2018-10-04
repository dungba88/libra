package org.joo.libra.collection;

import java.util.Collection;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.support.ListUtils;

/**
 * A predicate to check if one object is contained by another collection. It
 * will use Java built-in <code>contains</code> method of
 * {@link java.util.Collection}
 * 
 * @author griever
 *
 */
@SuppressWarnings("rawtypes")
public class InPredicate extends BinaryPredicate {

    @SuppressWarnings("unchecked")
	public InPredicate(final HasValue<?> one, final HasValue<?> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final Object one, final Object other) {
    	if (one instanceof String && other instanceof String)
            return other.toString().contains(one.toString());
        if (other instanceof Collection<?>)
            return ((Collection<?>) other).contains(one);
        if (other instanceof Object[])
            return ListUtils.contains((Object[]) other, one);
        return false;
    }
}
