package com.venki.playground.tensa.zangetsu.dynamic;

import org.junit.Test;

/**
 * Created by vm023561 on 4/2/15.
 */
public class DynamicProgrammingTest {

    @Test
    public void testKadaneAlgorithm() {
        int[] input = new int[] { 2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(DynamicProgramming.maxSubArrayProblem(input));
    }
}
