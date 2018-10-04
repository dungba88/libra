package org.joo.libra.sql.optimizers;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.AntlrSqlPredicateParser;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.node.ExpressionNode;

import lombok.Getter;

public class OptimizedAntlrSqlPredicateParser extends AntlrSqlPredicateParser {

	private static final int DEFAULT_THRESHOLD = 10;

	private @Getter ExpressionNode optimizedNode;

	private PredicateContext context = new PredicateContext(null);

	private Optimizer[] optimizers;

	private int threshold = DEFAULT_THRESHOLD;

	public OptimizedAntlrSqlPredicateParser() {
		this(DEFAULT_THRESHOLD, new ConstantFoldingOptimizer());
	}

	public OptimizedAntlrSqlPredicateParser(final int threshold) {
		this(threshold, new ConstantFoldingOptimizer());
	}

	public OptimizedAntlrSqlPredicateParser(final int threshold, final Optimizer... optimizers) {
		this.threshold = threshold;
		this.optimizers = optimizers;
		for (Optimizer optimizer : optimizers) {
			optimizer.setContext(context);
		}
	}

	@Override
	protected ExpressionNode doParse(final SqlParser parser) {
		ExpressionNode node = super.doParse(parser);
		optimizedNode = optimize(node);
		return optimizedNode;
	}

	private ExpressionNode optimize(final ExpressionNode node) {
		ExpressionNode currentNode = node;
		while (true) {
			int total = 0;
			int count = 0;
			for (Optimizer optimizer : optimizers) {
				OptimizeStatus status = optimizer.optimize(currentNode);
				currentNode = status.getNode();
				total += status.getChanges();
			}
			if (total == 0 || ++count >= threshold)
				break;
		}
		return currentNode;
	}
}