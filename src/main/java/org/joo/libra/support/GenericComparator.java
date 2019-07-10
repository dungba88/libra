package org.joo.libra.support;

import java.math.BigDecimal;

/**
 * Utility class for comparing numbers. Both numbers will be converted into
 * BigDecimal before comparing.
 * 
 * @author griever
 *
 */
public class GenericComparator {

    private GenericComparator() {

    }

    public static int compareNumber(final Number one, final Number other) {
        return BigDecimal.valueOf(one.doubleValue()).compareTo(BigDecimal.valueOf(other.doubleValue()));
    }

    public static boolean compare(final Object one, final Object other) {
        if (one == null)
            return other == null;
        if (one instanceof Number && other instanceof Number) {
            return compareNumber((Number) one, (Number) other) == 0;
        }
        return one.equals(other);
    }
}
