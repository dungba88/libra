package org.joo.libra.support.functions;

import org.joo.libra.PredicateContext;

public class SqrtFunction implements MultiArgsFunction {

	@Override
	public Object apply(PredicateContext context, Object[] t) {
		if (t == null || t.length != 1)
			throw new IllegalArgumentException("SQRT function must have exactly one argument");
		if (!(t[0] instanceof Number))
			throw new IllegalArgumentException("SQRT argument must be a number");
		Number arg = (Number) t[0];
		return Math.sqrt(arg.doubleValue());
	}
}
