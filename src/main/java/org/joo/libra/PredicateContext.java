package org.joo.libra;

import java.util.HashMap;
import java.util.Map;

import org.joo.libra.support.functions.MultiArgsFunction;

import lombok.Getter;

/**
 * Represents a predicate context. This is used to evaluate the predicate.
 * Generally the context itself is used by
 * {@link org.joo.libra.sql.node.VariableExpressionNode} to resolve the
 * variable. But it can also be used by any custom predicate to hold the value
 * they need while evaluating.
 * 
 * @author griever
 *
 */
public class PredicateContext {

	@Getter
	private Object context;

	@Getter
	private Map<String, Object> cachedValues;

	private Map<String, MultiArgsFunction> functionMappings = new HashMap<>();

	public PredicateContext(final Object context) {
		this.context = context;
		this.cachedValues = new HashMap<>();
	}

	public boolean hasCachedValue(final String key) {
		return cachedValues.containsKey(key);
	}

	public void registerFunction(final String name, final MultiArgsFunction function) {
		functionMappings.put(name, function);
	}

	public void unregisterFunction(final String name) {
		functionMappings.remove(name);
	}

	public MultiArgsFunction getRegisteredFunction(final String name) {
		return functionMappings.get(name);
	}
}
