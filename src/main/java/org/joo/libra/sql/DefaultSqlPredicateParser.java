package org.joo.libra.sql;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.joo.libra.Predicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.support.MalformedSyntaxException;

public class DefaultSqlPredicateParser implements SqlPredicateParser {

	@Override
	public Predicate parse(String predicate) {
		SqlErrorListener errorListener = new SqlErrorListener();
		CharStream stream = CharStreams.fromString(predicate);
		SqlLexer lexer = new SqlLexer(stream);
		lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
		lexer.addErrorListener(errorListener);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SqlParser parser = new SqlParser(tokens);
		parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
		parser.addErrorListener(errorListener);
		
		SqlVisitor visitor = new SqlVisitor();
		ExpressionNode node = visitor.visit(parser.predicate());
		if (node == null) {
			return null;
		}
		return node.buildPredicate();
	}
}

class SqlErrorListener extends BaseErrorListener {
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
							Object offendingSymbol,
							int line,
							int charPositionInLine,
							String msg,
							RecognitionException e)
	{
		throw new MalformedSyntaxException(msg);
	}
}