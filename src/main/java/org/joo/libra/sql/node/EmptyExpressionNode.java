package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.text.IsEmptyPredicate;

import lombok.Getter;
import lombok.Setter;

public class EmptyExpressionNode extends UnaryExpressionNode {

    private @Getter @Setter int op;

    @Override
    public Predicate buildPredicate() {
        if (op == SqlLexer.IS_NOT_EMPTY)
            return new NotPredicate(new IsEmptyPredicate((HasValue<?>) getInnerNode()));
        return new IsEmptyPredicate((HasValue<?>) getInnerNode());
    }
}