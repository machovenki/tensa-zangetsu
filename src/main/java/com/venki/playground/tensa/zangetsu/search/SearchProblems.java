package com.venki.playground.tensa.zangetsu.search;

/**
 * Created by vm023561 on 5/12/15.
 */
public class SearchProblems
{

    public static boolean findTwoSum(final int[] input, final int target){


        int start=0;
        int end=input.length-1;
        while(start!=end){
            int currentValue = input[start]+input[end];
            if(currentValue==target){
                return true;
            }
            else if(currentValue<target){
                start++;
            } else{
                end--;
            }
        }

        return false;
    }
}
