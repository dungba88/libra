package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.functional.AllMatchPredicate;
import org.joo.libra.sql.functional.AnyMatchPredicate;
import org.joo.libra.sql.functional.NoneMatchPredicate;

import lombok.Data;

@Data
public class MatchingExpressionNode implements ExpressionNode {

	private ExpressionNode condition;
	
	private int op;

	private String indexName;

	private HasValue<Object> list;

	@Override
	public Predicate buildPredicate() {
		Predicate conditionPredicate = condition.buildPredicate();
		switch(op) {
		case SqlLexer.ANY:
			return new AnyMatchPredicate(list, indexName, conditionPredicate);
		case SqlLexer.ALL:
			return new AllMatchPredicate(list, indexName, conditionPredicate);
		case SqlLexer.NONE:
			return new NoneMatchPredicate(list, indexName, conditionPredicate);
		default:
			return null;
		}
	}
}