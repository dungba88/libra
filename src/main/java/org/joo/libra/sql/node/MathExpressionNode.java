package org.joo.libra.sql.node;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.common.DerivedLiteralPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.support.GenericComparator;

public class MathExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> implements HasValue<Number> {

	private static final int ROUNDING_SCALE = 10;

	@Override
	public Predicate buildPredicate() {
		return new DerivedLiteralPredicate<Number>(this, value -> GenericComparator.compareNumber(value, 0) != 0);
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
			return left * right;
		case SqlLexer.DIVIDE:
			return BigDecimal.valueOf(left).divide(BigDecimal.valueOf(right), ROUNDING_SCALE, RoundingMode.HALF_UP);
		case SqlLexer.MOD:
			return left % right;
		case SqlLexer.POW:
			return Math.pow(left, right);
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
		case SqlLexer.MOD:
			return "MOD";
		case SqlLexer.POW:
			return "POW";
		default:
			return null;
		}
	}
}