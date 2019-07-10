package org.joo.libra.support.functions.mappings;

import org.joo.libra.support.functions.AvgFunction;
import org.joo.libra.support.functions.MaxFunction;
import org.joo.libra.support.functions.MinFunction;
import org.joo.libra.support.functions.SumFunction;

public class AggregateFunctions extends Functions {

    private static final AggregateFunctions instance;

    static {
        instance = new AggregateFunctions();
        instance.addFunction("avg", new AvgFunction());
        instance.addFunction("sum", new SumFunction());
        instance.addFunction("min", new MinFunction());
        instance.addFunction("max", new MaxFunction());
    }

    public static final AggregateFunctions getInstance() {
        return instance;
    }

    private AggregateFunctions() {
        // Nothing to do here
    }
}
