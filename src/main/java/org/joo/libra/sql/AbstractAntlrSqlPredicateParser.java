package org.joo.libra.sql;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.joo.libra.Predicate;
import org.joo.libra.sql.node.ExpressionNode;

public abstract class AbstractAntlrSqlPredicateParser<L extends Lexer, P extends Parser> implements SqlPredicateParser {

    @Override
    public Predicate parse(final String predicate) {
        CharStream stream = CharStreams.fromString(predicate);

        Lexer lexer = createLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        P parser = createParser(tokens);

        ExpressionNode node = doParse(parser);
        if (node == null)
            return null;
        return node.buildPredicate();
    }

    protected abstract L createLexer(CharStream stream);

    protected abstract P createParser(CommonTokenStream tokens);

    protected abstract ExpressionNode doParse(P parser);
}