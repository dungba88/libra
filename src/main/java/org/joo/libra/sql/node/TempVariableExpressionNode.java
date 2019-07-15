package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.pointer.VariablePredicate;

import lombok.Data;

@Data
public class TempVariableExpressionNode implements ExpressionNode, HasValue<Object> {

    private String variableName;

    @Override
    public Object getValue(final PredicateContext context) {
        if (context == null)
            return null;
        return context.getTempVariableValue(variableName);
    }

    @Override
    public Predicate buildPredicate() {
        return new VariablePredicate(this);
    }

    public String toString() {
        return variableName;
    }
}