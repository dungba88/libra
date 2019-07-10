package org.joo.libra.test;

import org.joo.libra.support.GenericComparator;
import org.junit.Test;

public class TestNumberComparePerf {

    private static final int TOTAL = 1000000;

    @Test
    public void testCompareTwoIntegerByBigDecimal() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareBigDecimal(1, 2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareTwoIntegerByBigDecimal", elapsed);
    }

    @Test
    public void testCompareTwoIntegerByNature() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareNumber(1, 2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareTwoIntegerByNature", elapsed);
    }

    @Test
    public void testCompareTwoDoubleByBigDecimal() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareBigDecimal(1.1, 2.2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareTwoDoubleByBigDecimal", elapsed);
    }

    @Test
    public void testCompareTwoDoubleByNature() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareNumber(1.1, 2.2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareTwoDoubleByNature", elapsed);
    }

    @Test
    public void testCompareIntegerAndDoubleByBigDecimal() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareBigDecimal(1, 2.2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareIntegerAndDoubleByBigDecimal", elapsed);
    }

    @Test
    public void testCompareIntegerAndDoubleByNature() {
        long started = System.nanoTime();
        for (int i = 0; i < TOTAL; i++) {
            GenericComparator.compareNumber(1, 2.2);
        }
        long elapsed = System.nanoTime() - started;
        print("testCompareIntegerAndDoubleByNature", elapsed);
    }

    private void print(String msg, long elapsed) {
        long throughput = (long) ((double) TOTAL / elapsed * 1e3);
        System.out.println(msg + ": " + elapsed / 1e6 + "ms. Throughput: " + throughput + " (M op/sec)");
    }
}
