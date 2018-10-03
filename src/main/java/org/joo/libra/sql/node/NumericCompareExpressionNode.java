package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.numeric.GreaterEqualPredicate;
import org.joo.libra.numeric.GreaterPredicate;
import org.joo.libra.numeric.LessEqualPredicate;
import org.joo.libra.numeric.LessPredicate;
import org.joo.libra.sql.antlr.SqlLexer;

public class NumericCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> {

    @Override
    public Predicate buildPredicate() {
        switch (getOp()) {
        case SqlLexer.GREATER_THAN:
            return new GreaterPredicate(getLeft(), getRight());
        case SqlLexer.GREATER_THAN_EQUALS:
            return new GreaterEqualPredicate(getLeft(), getRight());
        case SqlLexer.LESS_THAN:
            return new LessPredicate(getLeft(), getRight());
        case SqlLexer.LESS_THAN_EQUALS:
            return new LessEqualPredicate(getLeft(), getRight());
        default:
            return null;
        }
    }
}