package org.joo.libra.logic;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.numeric.NumericPredicate;

@SuppressWarnings("rawtypes")
public class EqualsPredicate extends BinaryPredicate {
	
	@SuppressWarnings("unchecked")
	public EqualsPredicate(HasValue<?> one, HasValue<?> other) {
		super(one, other);
	}

	@Override
	protected boolean doSatisifiedBy(Object one, Object other) {
		if (one instanceof Number && other instanceof Number) {
			return NumericPredicate.compare((Number)one, (Number)other) == 0;
		}
		return one.equals(other);
	}
}
