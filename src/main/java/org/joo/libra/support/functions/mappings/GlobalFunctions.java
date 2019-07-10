package org.joo.libra.support.functions.mappings;

public class GlobalFunctions extends Functions {

    private static final GlobalFunctions instance;
    
    static {
        instance = new GlobalFunctions();
        instance.addFunctions(AggregateFunctions.getInstance()) //
                .addFunctions(MathFunctions.getInstance()) //
                .addFunctions(StringFunctions.getInstance());
    }

    public static final GlobalFunctions getInstance() {
        return instance;
    }
    
    private GlobalFunctions() {
        // Nothing to do here
    }
}
