package org.joo.libra.sql;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.support.MalformedSyntaxException;

public class AntlrSqlPredicateParser extends AbstractAntlrSqlPredicateParser<SqlLexer, SqlParser> {

    protected SqlLexer createLexer(final CharStream stream) {
        SqlLexer lexer = new SqlLexer(stream);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        lexer.addErrorListener(new SqlErrorListener());
        return lexer;
    }

    protected SqlParser createParser(final CommonTokenStream tokens) {
        SqlParser parser = new SqlParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.addErrorListener(new SqlErrorListener());
        return parser;
    }

    protected ExpressionNode doParse(final SqlParser parser) {
        SqlVisitor visitor = new SqlVisitor();
        return visitor.visit(parser.predicate());
    }
}

class SqlErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
            final int charPositionInLine, final String msg, final RecognitionException e) {
        throw new MalformedSyntaxException(msg);
    }
}