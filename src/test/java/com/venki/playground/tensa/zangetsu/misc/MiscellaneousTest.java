package com.venki.playground.tensa.zangetsu.misc;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vm023561 on 4/24/15.
 */
public class MiscellaneousTest
{

    @Test
    public void testFindCommonCharacter(){
        List<String> input = Lists.newArrayList();
        input.add("aabbddeeff");
        input.add("aaadxyzzzmnnoopp");
        input.add("adbbbzzznnn");
        final Set<Character> expected = Sets.newHashSet();
        expected.add('a');
        expected.add('d');
        assertTrue((expected.containsAll(Miscellaneous.findCommonCharacter(input))));
    }
}
