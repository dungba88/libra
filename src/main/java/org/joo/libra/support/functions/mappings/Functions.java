package org.joo.libra.support.functions.mappings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.joo.libra.support.functions.MultiArgsFunction;

import lombok.Getter;

@Getter
public abstract class Functions {

    private Map<String, MultiArgsFunction> functionMappings = new HashMap<>();

    public MultiArgsFunction getRegisteredFunction(final String name) {
        if (functionMappings == null)
            return null;
        return functionMappings.get(name);
    }

    protected void addFunction(String name, MultiArgsFunction fn) {
        functionMappings.put(name, fn);
    }

    protected Functions addFunctions(Functions functions) {
        for (Entry<String, MultiArgsFunction> mapping : functions.getFunctionMappings().entrySet()) {
            addFunction(mapping.getKey(), mapping.getValue());
        }
        return this;
    }
}
