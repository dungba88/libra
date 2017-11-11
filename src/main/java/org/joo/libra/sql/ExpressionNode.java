package org.joo.libra.sql;

import java.math.BigDecimal;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.EqualsPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.logic.OrPredicate;
import org.joo.libra.numeric.GreaterEqualPredicate;
import org.joo.libra.numeric.GreaterThanPredicate;
import org.joo.libra.numeric.LessEqualPredicate;
import org.joo.libra.numeric.LessThanPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.text.ContainPredicate;
import org.joo.libra.text.MatchPredicate;

public interface ExpressionNode {

	public Predicate buildPredicate();
}

abstract class InfixExpressionNode implements ExpressionNode {
	
	private ExpressionNode left;

	private ExpressionNode right;

	public ExpressionNode getLeft() {
		return left;
	}

	public void setLeft(ExpressionNode left) {
		this.left = left;
	}

	public ExpressionNode getRight() {
		return right;
	}

	public void setRight(ExpressionNode right) {
		this.right = right;
	}
}

class AndExpressionNode extends InfixExpressionNode {

	@Override
	public Predicate buildPredicate() {
		return new AndPredicate(getLeft().buildPredicate(), getRight().buildPredicate());
	}
}

class OrExpressionNode extends InfixExpressionNode {

	@Override
	public Predicate buildPredicate() {
		return new OrPredicate(getLeft().buildPredicate(), getRight().buildPredicate());
	}
}

class NotExpressionNode implements ExpressionNode {
	
	private ExpressionNode innerNode;

	public ExpressionNode getInnerNode() {
		return innerNode;
	}

	public void setInnerNode(ExpressionNode innerNode) {
		this.innerNode = innerNode;
	}
	
	@Override
	public Predicate buildPredicate() {
		return new NotPredicate(innerNode.buildPredicate());
	}
}

class ValueExpressionNode<T> implements ExpressionNode, HasValue<T> {
	
	private T value;

	@Override
	public T getValue(PredicateContext context) {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public Predicate buildPredicate() {
		return null;
	}
}

class StringExpressionNode extends ValueExpressionNode<String> {
	
}

class NumberExpressionNode extends ValueExpressionNode<Number> {
	
}

class BooleanExpressionNode extends ValueExpressionNode<Boolean> {
	
}

class ObjectExpressionNode extends ValueExpressionNode<Object> {
	
}

class EmptyExpressionNode implements ExpressionNode {

	@Override
	public Predicate buildPredicate() {
		return null;
	}
}

class VariableExpressionNode implements ExpressionNode, HasValue<Object> {
	
	private String variableName;

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	@Override
	public Object getValue(PredicateContext context) {
		if (context == null) return null;
		return ObjectUtils.getValue(context.getContext(), variableName);
	}

	@Override
	public Predicate buildPredicate() {
		return null;
	}
}


abstract class AbstractBinaryOpExpressionNode<T extends HasValue<?>> implements ExpressionNode {

	private T left;
	
	private T right;
	
	private int op;

	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public T getRight() {
		return right;
	}

	public void setRight(T right) {
		this.right = right;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
}

class MathExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> implements HasValue<Number> {

	@Override
	public Predicate buildPredicate() {
		return null;
	}

	@Override
	public Number getValue(PredicateContext context) {
		double left = getLeft().getValue(context).doubleValue();
		double right = getRight().getValue(context).doubleValue();
		switch(getOp()) {
		case SqlLexer.PLUS:
			return left + right;
		case SqlLexer.MINUS:
			return left - right;
		case SqlLexer.TIMES:
			return new BigDecimal(left).multiply(new BigDecimal(right));
		case SqlLexer.DIVIDE:
			return new BigDecimal(left).divide(new BigDecimal(right));
		}
		return null;
	}
}

class NumericCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> {

	@Override
	public Predicate buildPredicate() {
		switch(getOp()) {
		case SqlLexer.GREATER_THAN:
			return new GreaterThanPredicate(getLeft(), getRight());
		case SqlLexer.GREATER_THAN_EQUALS:
			return new GreaterEqualPredicate(getLeft(), getRight());
		case SqlLexer.LESS_THAN:
			return new LessThanPredicate(getLeft(), getRight());
		case SqlLexer.LESS_THAN_EQUALS:
			return new LessEqualPredicate(getLeft(), getRight());
		}
		return null;
	}
	
}

class GenericCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<?>> {

	@Override
	public Predicate buildPredicate() {
		switch(getOp()) {
		case SqlLexer.EQUALS:
		case SqlLexer.IS_EQUALS:
		case SqlLexer.DBL_EQUALS:
			return new EqualsPredicate(getLeft(), getRight());
		case SqlLexer.NOT_EQUALS:
		case SqlLexer.IS_EQUALS_NOT:
			return new NotPredicate(new EqualsPredicate(getLeft(), getRight()));
		}
		return null;
	}
}

class LexicalCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<String>> {

	@Override
	public Predicate buildPredicate() {
		switch(getOp()) {
		case SqlLexer.MATCHES:
			return new MatchPredicate(getLeft(), getRight());
		}
		return null;
	}
}

class ContainsCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<?>> {

	@Override
	public Predicate buildPredicate() {
		return new ContainPredicate(getLeft(), getRight());
	}
}