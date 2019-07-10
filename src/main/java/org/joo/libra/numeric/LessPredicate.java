package org.joo.libra.numeric;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.support.GenericComparator;

/**
 * Represents a numeric <code>less than</code> predicate
 * 
 * @author griever
 *
 */
public class LessPredicate extends BinaryPredicate<Number, Number> {

	public LessPredicate(final HasValue<Number> one, final HasValue<Number> other) {
		super(one, other);
	}

	@Override
	protected boolean doSatisifiedBy(final Number one, final Number other) {
		return GenericComparator.compareNumber(one, other) < 0;
	}
}
