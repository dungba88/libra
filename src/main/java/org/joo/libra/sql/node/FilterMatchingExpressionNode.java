package org.joo.libra.sql.node;

import java.util.List;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasList;
import org.joo.libra.common.HasValue;
import org.joo.libra.functional.FilterMatchPredicate;

import lombok.Data;

@Data
public class FilterMatchingExpressionNode implements ExpressionNode, HasList {
    
    private HasValue<?> transform;

    private ExpressionNode condition;

    private int op;

    private String indexName;

    private HasValue<Object> list;

    @Override
    public Predicate buildPredicate() {
        Predicate conditionPredicate = condition.buildPredicate();
        return new FilterMatchPredicate(list, indexName, conditionPredicate, transform);
    }

    @Override
    public List<?> getValue(PredicateContext context) {
        return ((FilterMatchPredicate) buildPredicate()).getValue(context);
    }

    @Override
    public Object[] getValueAsArray(PredicateContext context) {
        return getValue(context).toArray();
    }
}