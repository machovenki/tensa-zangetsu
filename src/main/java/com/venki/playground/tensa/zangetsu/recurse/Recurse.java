package com.venki.playground.tensa.zangetsu.recurse;

/**
 * Created by vm023561 on 3/25/15.
 */
public class Recurse {

    public static void printPermutation(final String active, final String rest) {
        if (rest.isEmpty()) {
            if (active.length() == 3) {
                System.out.println(active);
            }
            return;
        }

        printPermutation(active + rest.substring(0, 1), rest.substring(1, rest.length()));
        printPermutation(active, rest.substring(1, rest.length()));
    }
}
