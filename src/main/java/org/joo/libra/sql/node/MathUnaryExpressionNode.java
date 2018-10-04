package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.common.SimplePredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.support.NumericComparator;

public class MathUnaryExpressionNode extends AbstractUnaryOpExpressionNode<HasValue<Number>> implements HasValue<Number> {

    @Override
    public Predicate buildPredicate() {
        Number value = getValue(null);
        return new SimplePredicate(NumericComparator.compare(value, 0) != 0);
    }

    @Override
    public Number getValue(final PredicateContext context) {
        double inner = getInner().getValue(context).doubleValue();
        switch (getOp()) {
        case SqlLexer.SQRT:
        	return Math.sqrt(inner);
        default:
            return null;
        }
    }
    
    public String toString() {
    	return getOpAsString() + "(" + getInner() + ")";
    }

	private String getOpAsString() {
		switch (getOp()) {
        case SqlLexer.SQRT:
            return "SQRT";
        default:
            return null;
        }
	}
}