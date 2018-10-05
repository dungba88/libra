package org.joo.libra.support.functions;

import org.joo.libra.PredicateContext;

public class RandFunction implements MultiArgsFunction {

	@Override
	public Object apply(PredicateContext context, Object[] t) {
		if (t != null && t.length != 0 && t.length != 2)
			throw new IllegalArgumentException("RAND function must have zeros or 2 arguments");
		if (t == null || t.length == 0)
			return rand();
		if (!(t[0] instanceof Number) || !(t[1] instanceof Number))
			throw new IllegalArgumentException("RAND arguments must be number");
		return rand((Number) t[0], (Number) t[1]);
	}

	private double rand(Number from, Number to) {
		double dFrom = from.doubleValue();
		double dTo = to.doubleValue();
		return Math.random() * (dTo - dFrom) + dFrom;
	}

	private double rand() {
		return Math.random();
	}
}
