package com.venki.playground.tensa.zangetsu.recurse;

import static com.venki.playground.tensa.zangetsu.recurse.Recurse.generateSubsets;
import static com.venki.playground.tensa.zangetsu.recurse.Recurse.printCombination;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vm023561 on 3/26/15.
 */
public class RecurseTest {

    @Test
    public void testRecurse() {
        printCombination("", "ABCD");
    }

    @Test
    public void testPermute() {
        Recurse.permutation("ABCDE");
    }

    @Test
    public void testPalindrome() {
        System.out.println(Recurse.isPalindrome("BLAH"));
    }

    @Test
    public void testPowerset(){
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(Recurse.powerSet(set));
    }

    @Test
    public void testSubsetSumNaive(){
        //3, 34, 4, 12, 5, 2
        Set<Integer> input = new HashSet<Integer>();
        input.add(3);
        input.add(34);
        input.add(4);
        input.add(12);
        input.add(5);
        input.add(2);


        System.out.println(generateSubsets(input,9));
    }
}
