package com.venki.playground.tensa.zangetsu.dac;

/**
 * Created by vm023561 on 3/23/15.
 */
public class DAC {

    public static int search(final int[] input, final int searchKey) {

        return binarySearch(input, 0, input.length - 1, searchKey);
    }

    public static int binarySearch(final int[] input, final int low, final int high, final int searchKey) {

        if (high < low) {
            return -1;
        }

        final int median = low + (high - low) / 2;

        if (searchKey < input[median]) {
            return binarySearch(input, low, median, searchKey);
        } else if (searchKey > input[median]) {
            return binarySearch(input, median + 1, high, searchKey);
        }
        return median;
    }

    /**
     * Iterative binary search.
     * @param input
     * @param searchKey
     * @param low
     * @param hi
     * @return
     */
    public static int iterativeBinarySearch(final int[] input, final int searchKey, int low, int hi) {

        while (low <= hi) {
            int median = low + (hi - low) / 2;
            if (searchKey == input[median]) {
                return median;
            } else if (input[median] < searchKey) {
                low = median + 1;
            } else {
                hi = median - 1;
            }
        }

        return -1;
    }

}
