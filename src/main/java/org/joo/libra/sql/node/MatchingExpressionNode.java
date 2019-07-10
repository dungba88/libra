package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.functional.AllMatchPredicate;
import org.joo.libra.functional.AnyMatchPredicate;
import org.joo.libra.functional.NoneMatchPredicate;
import org.joo.libra.sql.antlr.SqlLexer;

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