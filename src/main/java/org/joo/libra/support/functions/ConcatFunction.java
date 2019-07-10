package org.joo.libra.support.functions;

import org.joo.libra.PredicateContext;

public class ConcatFunction implements MultiArgsFunction {

    @Override
    public Object apply(PredicateContext context, Object[] t) {
        if (t == null || t.length == 0)
            throw new IllegalArgumentException("CONCAT function must have at least one argument");
        StringBuilder sb = new StringBuilder();
        for (Object item : t) {
            sb.append(item);
        }
        return sb.toString();
    }
}
