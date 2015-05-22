package com.venki.playground.tensa.zangetsu.search;

import org.junit.Test;

/**
 * Created by vm023561 on 5/12/15.
 */
public class SearchProblemsTest
{

    @Test
    public void testTwoSum(){
        int[] input = new int[]{1,2,3,6,7,9};

        System.out.println(SearchProblems.findTwoSum(input,6));
    }
}
