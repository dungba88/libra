package org.joo.libra.text;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public class NotMatchPredicate extends BinaryPredicate<String, String> {

	public NotMatchPredicate(HasValue<String> one, HasValue<String> other) {
		super(one, other);
	}

	@Override
	protected boolean doSatisifiedBy(String one, String other) {
		return !one.matches(other);
	}
}