package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimplePredicate;

public class ObjectExpressionNode extends ValueExpressionNode<Object> {

    @Override
    public Predicate buildPredicate() {
        return new SimplePredicate(value != null);
    }
    
    public String toString() {
    	return value + "";
    }
}
