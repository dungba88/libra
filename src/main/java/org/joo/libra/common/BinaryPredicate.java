package org.joo.libra.common;

import org.joo.libra.PredicateContext;

public abstract class BinaryPredicate<T, H> extends CompositionPredicate {
	
	private HasValue<T> one;
	
	private HasValue<H> other;

	public BinaryPredicate(HasValue<T> one, HasValue<H> other) {
		this.one = one;
		this.other = other;
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) {
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
