package org.joo.libra.support.functions;

import java.util.Collection;

import org.joo.libra.PredicateContext;

public class LenFunction implements MultiArgsFunction {

	@SuppressWarnings("rawtypes")
	@Override
	public Object apply(PredicateContext context, Object[] t) {
		if (t == null || t.length != 1)
			throw new IllegalArgumentException("LEN function must have exactly one argument");
		Object obj = t[0];
		if (obj instanceof Collection)
			return ((Collection) obj).size();
		if (obj instanceof Object[])
			return ((Object[]) obj).length;
		if (obj instanceof String)
			return ((String) obj).length();
		throw new IllegalArgumentException("LEN argument must be array, list or string");
	}
}
