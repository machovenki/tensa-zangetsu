package com.venki.playground.tensa.zangetsu.recurse;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vm023561 on 3/25/15.
 */
public class Recurse {

    public static int count = 0;

    public static void printCombination(final String active, final String rest) {
        if (rest.isEmpty()) {
            System.out.println(active);
            return;
        }

        printCombination(active + rest.substring(0, 1), rest.substring(1, rest.length()));
        printCombination(active, rest.substring(1, rest.length()));
    }

    public static void permutation(String str) {
        permutation("", str);
        System.out.println("final count:" + count);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            count++;
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static boolean isPalindrome(final String input) {

        if (input.length() <= 1) {
            return true;
        }

        return (input.charAt(0) == input.charAt(input.length() - 1))
                && isPalindrome(input.substring(1, input.length() - 1));
    }

    public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<T>());
            return sets;
        }
        List<T> list = new ArrayList<T>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<T>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }


    public static boolean generateSubsets(final Set<Integer> input, final int target){

        Set<Set<Integer>> powerSet = powerSet(input);
        Set<Integer> subsetSums = new HashSet<Integer>();

        for(final Set<Integer> set: powerSet){
            int sum=0;
            for(final Integer value: set){
                sum+=value;
            }
            subsetSums.add(sum);
        }

        return subsetSums.contains(target);
    }


}
