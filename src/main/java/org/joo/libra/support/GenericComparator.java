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
        if (one instanceof Integer && other instanceof Integer)
            return compareInteger(one.intValue(), other.intValue());
        if (one instanceof BigDecimal || other instanceof BigDecimal)
            return compareBigDecimal(one, other);
        if (one instanceof Double || other instanceof Double)
            return compareDouble(one.doubleValue(), other.doubleValue());
        if (one instanceof Long || other instanceof Long)
            return compareLong(one.longValue(), other.longValue());
        return compareBigDecimal(one, other);
    }

    public static int compareBigDecimal(final Number one, final Number other) {
        BigDecimal d1 = one instanceof BigDecimal ? (BigDecimal) one : BigDecimal.valueOf(one.doubleValue());
        BigDecimal d2 = other instanceof BigDecimal ? (BigDecimal) other : BigDecimal.valueOf(other.doubleValue());
        return d1.compareTo(d2);
    }

    public static int compareInteger(int d1, int d2) {
        if (d1 == d2)
            return 0;
        return d1 > d2 ? 1 : -1;
    }

    public static int compareLong(long d1, long d2) {
        if (d1 == d2)
            return 0;
        return d1 > d2 ? 1 : -1;
    }

    public static int compareDouble(double d1, double d2) {
        if (d1 == d2)
            return 0;
        return d1 > d2 ? 1 : -1;
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
