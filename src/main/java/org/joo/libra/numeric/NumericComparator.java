package org.joo.libra.numeric;

import java.math.BigDecimal;

/**
 * Utility class for comparing numbers. Both numbers will be converted into
 * BigDecimal before comparing.
 * 
 * @author griever
 *
 */
public class NumericComparator {

    private NumericComparator() {

    }

    public static int compare(final Number one, final Number other) {
        return BigDecimal.valueOf(one.doubleValue()).compareTo(BigDecimal.valueOf(other.doubleValue()));
    }
}
