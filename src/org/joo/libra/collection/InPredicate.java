package org.joo.libra.collection;

import java.util.Collection;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public class InPredicate extends BinaryPredicate<Object, Collection<?>> {

	public InPredicate(HasValue<Object> one, HasValue<Collection<?>> other) {
		super(one, other);
	}

	@Override
	protected boolean doSatisifiedBy(Object one, Collection<?> other) {
		return other.contains(one);
	}
}
