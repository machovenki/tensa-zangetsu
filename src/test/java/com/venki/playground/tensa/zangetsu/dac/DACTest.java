package com.venki.playground.tensa.zangetsu.dac;

import static com.venki.playground.tensa.zangetsu.dac.DAC.iterativeBinarySearch;
import static com.venki.playground.tensa.zangetsu.dac.DAC.search;

import org.junit.Test;

/**
 * Created by vm023561 on 3/23/15.
 */
public class DACTest {

    @Test
    public void testRecursiveBinarySearch() {
        final int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        final int searchKey = 24;
        System.out.println(search(input, searchKey));
    }

    @Test
    public void testIterativeBinarySearch() {
        final int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        final int searchKey = 6;
        System.out.println(iterativeBinarySearch(input, searchKey, 0, input.length - 1));
    }
}
