package org.joo.libra.sql;

import java.util.HashSet;
import java.util.Set;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

public class OptimizedAntlrSqlPredicateParser extends AntlrSqlPredicateParser {

	private Set<ExpressionNode> hasVariableNodes = new HashSet<>();

	private ExpressionNode optimizedNode;
	
	private PredicateContext context = new PredicateContext(null);

	protected ExpressionNode doParse(SqlParser parser) {
		ExpressionNode node = super.doParse(parser);
		optimizedNode = optimizeConstantFolding(node);
		return optimizedNode;
	}

	private ExpressionNode optimizeConstantFolding(ExpressionNode node) {
		if (checkVariableNode(node))
			return node;
		if (node instanceof InfixExpressionNode)
			return optimizeInfixNode((InfixExpressionNode) node);
		if (node instanceof AbstractBinaryOpExpressionNode)
			return optimizeBinaryNode((AbstractBinaryOpExpressionNode<?>) node);
		if (node instanceof UnaryExpressionNode) {
			return optimizeUnaryNode((UnaryExpressionNode) node);
		}
		return node;
	}

	private boolean checkVariableNode(ExpressionNode node) {
		if (hasVariableNodes.contains(node))
			return true;
		if (node instanceof VariableExpressionNode) {
			if (context.hasCachedValue(((VariableExpressionNode) node).getVariableName()))
				return false;
			hasVariableNodes.add(node);
			return true;
		}
		return false;
	}

	private ExpressionNode optimizeUnaryNode(UnaryExpressionNode node) {
		ExpressionNode innerNode = optimizeConstantFolding(node.getInnerNode());
		node.setInnerNode(innerNode);
		if (checkVariableNode(innerNode)) {
			hasVariableNodes.add(node);
			return node;
		}
		return optimizeConstantFolding(node);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ExpressionNode optimizeBinaryNode(AbstractBinaryOpExpressionNode node) {
		ExpressionNode leftNode = optimizeConstantFolding((ExpressionNode) node.getLeft());
		ExpressionNode rightNode = optimizeConstantFolding((ExpressionNode) node.getRight());
		node.setLeft((HasValue) leftNode);
		node.setRight((HasValue) rightNode);
		if (checkVariableNode(leftNode) || checkVariableNode(rightNode)) {
			hasVariableNodes.add(node);
			return node;
		}
		if (node instanceof MathExpressionNode)
			return optimizeMathNode((MathExpressionNode) node);
		return optimizeSingleNode(node);
	}

	private ExpressionNode optimizeInfixNode(InfixExpressionNode node) {
		ExpressionNode leftNode = optimizeConstantFolding(node.getLeft());
		ExpressionNode rightNode = optimizeConstantFolding(node.getRight());
		node.setLeft(leftNode);
		node.setRight(rightNode);

		boolean leftIsVariable = checkVariableNode(leftNode);
		boolean rightIsVariable = checkVariableNode(rightNode);

		if (leftIsVariable || rightIsVariable)
			hasVariableNodes.add(node);
		
		if (leftIsVariable && rightIsVariable)
			return node;

		Boolean leftCondition = leftIsVariable ? null : evaluateNode(leftNode);
		Boolean rightCondition = rightIsVariable ? null : evaluateNode(rightNode);
		
		if (node instanceof AndExpressionNode) {
			if (Boolean.FALSE.equals(leftCondition) || Boolean.FALSE.equals(rightCondition))
				return new BooleanExpressionNode(false);
		} else if (node instanceof OrExpressionNode) {
			if (Boolean.TRUE.equals(leftCondition) || Boolean.TRUE.equals(rightCondition))
				return new BooleanExpressionNode(true);
		}
		
		return node;
	}

	private ExpressionNode optimizeSingleNode(ExpressionNode node) {
		return new BooleanExpressionNode(evaluateNode(node));
	}

	private boolean evaluateNode(ExpressionNode node) {
		Predicate predicate = node.buildPredicate();
		try {
			return predicate.satisfiedBy(context);
		} catch (PredicateExecutionException e) {
			throw new MalformedSyntaxException(e);
		}
	}

	private ExpressionNode optimizeMathNode(MathExpressionNode node) {
		Number value = node.getValue(null);
		NumberExpressionNode result = new NumberExpressionNode();
		result.setValue(value);
		return result;
	}

	public ExpressionNode getOptimizedNode() {
		return optimizedNode;
	}
}