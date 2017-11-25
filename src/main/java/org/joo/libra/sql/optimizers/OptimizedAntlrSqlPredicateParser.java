package org.joo.libra.sql.optimizers;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.AntlrSqlPredicateParser;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.node.ExpressionNode;

import lombok.Getter;

public class OptimizedAntlrSqlPredicateParser extends AntlrSqlPredicateParser {

    private @Getter ExpressionNode optimizedNode;

    private PredicateContext context = new PredicateContext(null);

    private Optimizer[] optimizers;

    public OptimizedAntlrSqlPredicateParser() {
        this(new ConstantFoldingOptimizer());
    }

    public OptimizedAntlrSqlPredicateParser(final Optimizer... optimizers) {
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
            for (Optimizer optimizer : optimizers) {
                OptimizeStatus status = optimizer.optimize(currentNode);
                currentNode = status.getNode();
                total += status.getChanges();
            }
            if (total == 0)
                break;
        }
        return currentNode;
    }
}