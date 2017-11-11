package org.joo.libra.sql;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;

public class SqlPredicate extends CompositionPredicate {
	
	private Predicate predicate;

	public SqlPredicate(String predicate) {
		this.predicate = parse(predicate);
	}

	private Predicate parse(String predicate) {
		CharStream stream = CharStreams.fromString(predicate);
		SqlLexer lexer = new SqlLexer(stream);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SqlParser parser = new SqlParser(tokens);
		SqlVisitor visitor = new SqlVisitor();
		ExpressionNode node = visitor.visit(parser.predicate());
		if (node == null) return null;
		return node.buildPredicate();
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) {
		return predicate != null ? predicate.satisfiedBy(context) : false;
	}
}
