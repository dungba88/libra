package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.SimplePredicate;
import org.joo.libra.numeric.NumericComparator;

public class NumberExpressionNode extends ValueExpressionNode<Number> {

    public NumberExpressionNode() {

    }

    public NumberExpressionNode(final Number value) {
        this.value = value;
    }

    @Override
    public Predicate buildPredicate() {
        return new SimplePredicate(value != null && NumericComparator.compare(value, 0) != 0);
    }
    
    public String toString() {
    	return value + "";
    }
}