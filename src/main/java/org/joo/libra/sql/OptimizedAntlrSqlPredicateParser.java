package org.joo.libra.sql;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.antlr.SqlParser;

public class OptimizedAntlrSqlPredicateParser extends AntlrSqlPredicateParser {

	private ExpressionNode optimizedNode;
	
	private PredicateContext context = new PredicateContext(null);

	private Optimizer[] optimizers;
	
	public OptimizedAntlrSqlPredicateParser() {
		this(new ConstantFoldingOptimizer());
	}
	
	public OptimizedAntlrSqlPredicateParser(Optimizer...optimizers) {
		this.optimizers = optimizers;
		for(Optimizer optimizer : optimizers) {
			optimizer.setContext(context);
		}
	}

	@Override
	protected ExpressionNode doParse(SqlParser parser) {
		ExpressionNode node = super.doParse(parser);
		optimizedNode = optimize(node);
		return optimizedNode;
	}

	private ExpressionNode optimize(ExpressionNode node) {
		while(true) {
			int total = 0;
			for(Optimizer optimizer : optimizers) {
				OptimizeStatus status = optimizer.optimize(node);
				node = status.getNode();
				total += status.getChanges();
			}
			if (total == 0) break;
		}
		return node;
	}

	public ExpressionNode getOptimizedNode() {
		return optimizedNode;
	}
}