package org.joo.libra.sql;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

public class SqlPredicate extends CompositionPredicate {
	
	private boolean error;
	
	private MalformedSyntaxException cause;
	
	private Predicate predicate;

	public SqlPredicate(String predicate) {
		this.predicate = parse(predicate);
	}

	private Predicate parse(String predicate) {
		try {
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
				error = true;
				return null;
			}
			return node.buildPredicate();
		} catch(MalformedSyntaxException ex) {
			error = true;
			cause = ex;
			return null;
		}
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
		if (error) return false;
		try {
			return predicate != null ? predicate.satisfiedBy(context) : false;
		} catch(Throwable ex) {
			throw new PredicateExecutionException("Exception while executing SQL predicate", ex);
		}
	}
	
	public void checkForErrorAndThrow() {
		if (error) throw cause;
	}
	
	public boolean hasError() {
		return error;
	}
	
	public MalformedSyntaxException getCause() {
		return cause;
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