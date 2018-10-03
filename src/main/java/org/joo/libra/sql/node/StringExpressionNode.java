package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimplePredicate;

public class StringExpressionNode extends ValueExpressionNode<String> {

    @Override
    public Predicate buildPredicate() {
        return new SimplePredicate(value != null && !value.isEmpty());
    }
    
    public String toString() {
    	return "'" + value + "'";
    }
}