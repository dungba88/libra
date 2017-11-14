package org.joo.libra.sql;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

public class SqlPredicate extends CompositionPredicate {
	
	private boolean error;
	
	private MalformedSyntaxException cause;
	
	private Predicate predicate;

	public SqlPredicate(String predicate) {
		this(predicate, new AntlrSqlPredicateParser());
	}
	
	public SqlPredicate(String predicate, SqlPredicateParser parser) {
		try {
			this.predicate = parser.parse(predicate);
		} catch (MalformedSyntaxException ex) {
			error = true;
			cause = ex;
		}
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
		if (error || predicate == null) return false;
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