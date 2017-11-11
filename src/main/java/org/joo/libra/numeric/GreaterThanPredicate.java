package org.joo.libra.numeric;

import org.joo.libra.common.HasValue;

public class GreaterThanPredicate extends NumericPredicate {

	public GreaterThanPredicate(HasValue<Number> one, HasValue<Number> other) {
		super(one, other);
	}

	@Override
	protected boolean doSatisifiedBy(Number one, Number other) {
		return compare(one, other) > 0;
	}
}
