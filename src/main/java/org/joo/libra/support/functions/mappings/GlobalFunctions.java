package org.joo.libra.support.functions.mappings;

public class GlobalFunctions extends Functions {

    private static final GlobalFunctions instance;

    static {
        instance = new GlobalFunctions();
        instance.addFunctions(new AggregateFunctions()) //
                .addFunctions(new MathFunctions()) //
                .addFunctions(new StringFunctions());
    }

    public static final GlobalFunctions getInstance() {
        return instance;
    }
}
