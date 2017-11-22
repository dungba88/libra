package org.joo.libra.text;

import java.util.Collection;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.common.HasValue;

public class EmptyPredicate extends CompositionPredicate {

	private HasValue<?> value;

	public EmptyPredicate(HasValue<?> value) {
		this.value = value;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean satisfiedBy(PredicateContext context) {
		Object rawValue = value.getValue(context);
		if (rawValue == null) return true;
		if (rawValue instanceof String) {
			rawValue.toString().isEmpty();
		}
		if (rawValue instanceof Collection) {
			return ((Collection)rawValue).isEmpty();
		}
		return false;
	}
}
