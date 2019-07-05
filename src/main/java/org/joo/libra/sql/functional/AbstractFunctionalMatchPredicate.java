package org.joo.libra.sql.functional;

import java.util.Collection;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.support.exceptions.PredicateExecutionException;

public abstract class AbstractFunctionalMatchPredicate implements Predicate {

	protected HasValue<Object> list;
	protected String indexName;
	protected Predicate conditionPredicate;

	public AbstractFunctionalMatchPredicate(HasValue<Object> list, String indexName, Predicate conditionPredicate) {
		this.list = list;
		this.indexName = indexName;
		this.conditionPredicate = conditionPredicate;
	}

	@Override
	public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
		Object listValue = list.getValue(context);
		if (listValue == null)
			return satisfiesAsArray(new Object[0], context);
		if (listValue instanceof Object[])
			return satisfiesAsArray((Object[]) listValue, context);
		if (listValue instanceof Collection)
			return satisfiesAsCollection((Collection<?>) listValue, context);
		return false;
	}

	protected abstract boolean satisfiesAsCollection(Collection<?> listValue, PredicateContext context);

	protected abstract boolean satisfiesAsArray(Object[] listValue, PredicateContext context);

	protected boolean satisfiedBy(Object value, PredicateContext context) {
		context.setTempVariable(indexName, value);
		return conditionPredicate.satisfiedBy(context);
	}
}
