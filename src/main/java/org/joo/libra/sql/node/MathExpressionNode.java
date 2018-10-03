package org.joo.libra.sql.node;

import java.math.BigDecimal;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.common.SimplePredicate;
import org.joo.libra.numeric.NumericComparator;
import org.joo.libra.sql.antlr.SqlLexer;

public class MathExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> implements HasValue<Number> {

    @Override
    public Predicate buildPredicate() {
        Number value = getValue(null);
        return new SimplePredicate(NumericComparator.compare(value, 0) != 0);
    }

    @Override
    public Number getValue(final PredicateContext context) {
        double left = getLeft().getValue(context).doubleValue();
        double right = getRight().getValue(context).doubleValue();
        switch (getOp()) {
        case SqlLexer.PLUS:
            return left + right;
        case SqlLexer.MINUS:
            return left - right;
        case SqlLexer.TIMES:
            return BigDecimal.valueOf(left).multiply(BigDecimal.valueOf(right));
        case SqlLexer.DIVIDE:
            return BigDecimal.valueOf(left).divide(BigDecimal.valueOf(right));
        default:
            return null;
        }
    }
    
    public String toString() {
    	return getOpAsString() + "(" + getLeft() + "," + getRight() + ")";
    }

	private String getOpAsString() {
		switch (getOp()) {
        case SqlLexer.PLUS:
            return "PLUS";
        case SqlLexer.MINUS:
            return "MINUS";
        case SqlLexer.TIMES:
            return "TIMES";
        case SqlLexer.DIVIDE:
            return "DIVIDE";
        default:
            return null;
        }
	}
}