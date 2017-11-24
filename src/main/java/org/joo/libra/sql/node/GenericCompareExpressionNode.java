package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.logic.EqualsPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.sql.antlr.SqlLexer;

public class GenericCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<?>> {

    @Override
    public Predicate buildPredicate() {
        switch (getOp()) {
        case SqlLexer.EQUALS:
        case SqlLexer.IS_EQUALS:
        case SqlLexer.DBL_EQUALS:
            return new EqualsPredicate(getLeft(), getRight());
        case SqlLexer.NOT_EQUALS:
        case SqlLexer.IS_EQUALS_NOT:
            return new NotPredicate(new EqualsPredicate(getLeft(), getRight()));
        default:
            return null;
        }
    }
}