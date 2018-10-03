package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimplePredicate;

public class BooleanExpressionNode extends ValueExpressionNode<Boolean> {

    public BooleanExpressionNode() {

    }

    public BooleanExpressionNode(final boolean value) {
        this.value = value;
    }

    @Override
    public Predicate buildPredicate() {
        return new SimplePredicate(Boolean.TRUE.equals(value));
    }
    
    public String toString() {
    	return value + "";
    }
}