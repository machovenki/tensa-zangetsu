package com.venki.playground.tensa.zangetsu.recurse;

import static com.venki.playground.tensa.zangetsu.recurse.Recurse.printCombination;

import org.junit.Test;

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
}
