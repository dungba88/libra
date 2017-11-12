package org.joo.libra.common;

import org.joo.libra.PredicateContext;

public class SimpleHasValue<T> implements HasValue<T> {
	
	private T value;
	
	public SimpleHasValue(T value) {
		this.value = value;
	}

	@Override
	public T getValue(PredicateContext context) {
		return value;
	}
}
