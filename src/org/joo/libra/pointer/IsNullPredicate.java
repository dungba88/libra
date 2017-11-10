package org.joo.libra.pointer;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

public class IsNullPredicate extends CompositionPredicate {

	private HasValue<Object> value;

	public IsNullPredicate(HasValue<Object> value) {
		this.value = value;
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) {
		return value == null;
	}
}
