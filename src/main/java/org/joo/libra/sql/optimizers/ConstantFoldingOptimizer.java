package org.joo.libra.sql.optimizers;

import java.util.HashSet;
import java.util.Set;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.node.AbstractBinaryOpExpressionNode;
import org.joo.libra.sql.node.AndExpressionNode;
import org.joo.libra.sql.node.BooleanExpressionNode;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.sql.node.InfixExpressionNode;
import org.joo.libra.sql.node.MathExpressionNode;
import org.joo.libra.sql.node.NumberExpressionNode;
import org.joo.libra.sql.node.UnaryExpressionNode;
import org.joo.libra.sql.node.VariableExpressionNode;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

public class ConstantFoldingOptimizer implements Optimizer {

    private Set<ExpressionNode> hasVariableNodes;

    private PredicateContext context;

    private int changes = 0;

    @Override
    public OptimizeStatus optimize(final ExpressionNode node) {
        hasVariableNodes = new HashSet<>();
        changes = 0;
        ExpressionNode optimizedNode = optimizeConstantFolding(node);
        return new OptimizeStatus(optimizedNode, changes);
    }

    private ExpressionNode optimizeConstantFolding(final ExpressionNode node) {
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

    private boolean checkVariableNode(final ExpressionNode node) {
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

    private ExpressionNode optimizeUnaryNode(final UnaryExpressionNode node) {
        ExpressionNode innerNode = optimizeConstantFolding(node.getInnerNode());
        node.setInnerNode(innerNode);
        if (checkVariableNode(innerNode)) {
            hasVariableNodes.add(node);
            return node;
        }
        return optimizeSingleNode(node);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private ExpressionNode optimizeBinaryNode(final AbstractBinaryOpExpressionNode node) {
        ExpressionNode leftNode = optimizeConstantFolding((ExpressionNode) node.getLeft());
        ExpressionNode rightNode = optimizeConstantFolding((ExpressionNode) node.getRight());
        node.setLeft((HasValue) leftNode);
        node.setRight((HasValue) rightNode);
        if (checkVariableNode(leftNode) || checkVariableNode(rightNode)) {
            hasVariableNodes.add(node);
            return node;
        }
        changes++;
        if (node instanceof MathExpressionNode)
            return optimizeMathNode((MathExpressionNode) node);
        return optimizeSingleNode(node);
    }

    private ExpressionNode optimizeInfixNode(final InfixExpressionNode node) {
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

        changes++;

        Boolean leftCondition = leftIsVariable ? null : evaluateNode(leftNode);
        Boolean rightCondition = rightIsVariable ? null : evaluateNode(rightNode);

        if (node instanceof AndExpressionNode)
            return optimizeAndNode(leftNode, rightNode, leftIsVariable, leftCondition, rightCondition);
        return optimizeOrNode(leftNode, rightNode, leftIsVariable, leftCondition, rightCondition);
    }

    private ExpressionNode optimizeOrNode(final ExpressionNode leftNode, final ExpressionNode rightNode,
            final boolean leftIsVariable, final Boolean leftCondition, final Boolean rightCondition) {
        if (Boolean.TRUE.equals(leftCondition) || Boolean.TRUE.equals(rightCondition))
            return new BooleanExpressionNode(true);
        if (leftIsVariable)
            return leftNode;
        return rightNode;
    }

    private ExpressionNode optimizeAndNode(final ExpressionNode leftNode, final ExpressionNode rightNode,
            final boolean leftIsVariable, final Boolean leftCondition, final Boolean rightCondition) {
        if (Boolean.FALSE.equals(leftCondition) || Boolean.FALSE.equals(rightCondition))
            return new BooleanExpressionNode(false);
        if (leftIsVariable)
            return leftNode;
        return rightNode;
    }

    private ExpressionNode optimizeSingleNode(final ExpressionNode node) {
        return new BooleanExpressionNode(evaluateNode(node));
    }

    private ExpressionNode optimizeMathNode(final MathExpressionNode node) {
        return new NumberExpressionNode(node.getValue(context));
    }

    private boolean evaluateNode(final ExpressionNode node) {
        Predicate predicate = node.buildPredicate();
        try {
            return predicate.satisfiedBy(context);
        } catch (PredicateExecutionException e) {
            throw new MalformedSyntaxException(e);
        }
    }

    public PredicateContext getContext() {
        return context;
    }

    @Override
    public void setContext(final PredicateContext context) {
        this.context = context;
    }
}
