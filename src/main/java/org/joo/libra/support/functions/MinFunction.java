package org.joo.libra.support.functions;

import java.util.Arrays;

import org.joo.libra.PredicateContext;

public class MinFunction implements MultiArgsFunction {

	@Override
	public Object apply(PredicateContext context, Object[] t) {
		if (t == null || t.length == 0)
			throw new IllegalArgumentException("MIN function must have at least one argument");
		return Arrays.stream(t).map(number -> (Number) number).mapToDouble(number -> number.doubleValue()).min()
				.getAsDouble();
	}
}
