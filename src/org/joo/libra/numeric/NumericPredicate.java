package org.joo.libra.numeric;

import java.math.BigDecimal;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public abstract class NumericPredicate extends BinaryPredicate<Number, Number> {

	public NumericPredicate(HasValue<Number> one, HasValue<Number> other) {
		super(one, other);
	}
	
	public static int compare(Number one, Number other) {
		return BigDecimal.valueOf(one.doubleValue()).compareTo(BigDecimal.valueOf(other.doubleValue()));
	}
}
