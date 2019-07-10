package org.joo.libra.support.functions;

import java.util.HashMap;
import java.util.Map;

public class GlobalFunctions {

    private static final GlobalFunctions instance;

    private Map<String, MultiArgsFunction> functionMappings = new HashMap<>();

    static {
        instance = new GlobalFunctions();
        instance.functionMappings.put("sqrt", new SqrtFunction());
        instance.functionMappings.put("avg", new AvgFunction());
        instance.functionMappings.put("sum", new SumFunction());
        instance.functionMappings.put("min", new MinFunction());
        instance.functionMappings.put("max", new MaxFunction());
        instance.functionMappings.put("len", new LenFunction());
        instance.functionMappings.put("rand", new RandFunction());
        instance.functionMappings.put("concat", new ConcatFunction());
    }

    public static final GlobalFunctions getInstance() {
        return instance;
    }

    public MultiArgsFunction getRegisteredFunction(final String name) {
        if (functionMappings == null)
            return null;
        return functionMappings.get(name);
    }
}
