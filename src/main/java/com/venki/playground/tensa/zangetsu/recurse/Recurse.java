package com.venki.playground.tensa.zangetsu.recurse;

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
}
