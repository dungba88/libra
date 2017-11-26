package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.text.MatchPredicate;

public class LexicalCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<String>> {

    @Override
    public Predicate buildPredicate() {
        if (getOp() == SqlLexer.MATCHES)
            return new MatchPredicate(getLeft(), getRight());
        return null;
    }
}