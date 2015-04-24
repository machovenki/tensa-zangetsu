package com.venki.playground.tensa.zangetsu.dynamic;

/**
 * Created by vm023561 on 4/2/15.
 */
public class DynamicProgramming {

    public static long maxSubArrayProblem(final int[] input) {

        long max_so_far = 0;
        long max_ending_here = 0;

        for (int i = 0; i < input.length - 1; i++) {
            max_ending_here += input[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }
}
