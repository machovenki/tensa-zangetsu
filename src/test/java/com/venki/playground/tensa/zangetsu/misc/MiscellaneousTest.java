package com.venki.playground.tensa.zangetsu.misc;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.venki.playground.tensa.zangetsu.misc.Miscellaneous.Student;
import com.venki.playground.tensa.zangetsu.misc.Miscellaneous.StudentComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

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

    @Test
    public void testStudent(){
        Student student1 = new Student(100,89,"Macho");
        Student student2 = new Student(101,90,"Blah");
        Student student3 = new Student(102,77,"Aero");

        List<Student> collection = new ArrayList<Student>();
        collection.add(student1);
        collection.add(student2);
        collection.add(student3);

        Collections.sort(collection,new StudentComparator());
        System.out.println(collection);

        Map<Integer,Student> map= Maps.newHashMap();

        map.put(student1.getId(),student1);
        map.put(student2.getId(),student2);
        map.put(student3.getId(),student3);

        StudentComparator comparator = new StudentComparator();

        Map<Integer,Student> treeMap = new TreeMap<Integer, Student>(
                (SortedMap<Integer, ? extends Student>) comparator);

        System.out.println(treeMap);


    }

    @Test
    public void testDistance(){
        System.out.println(Miscellaneous.distance("hello how are hello", "hello","you"));
    }

    @Test
    public void testPower(){
        System.out.println(Miscellaneous.power(-2,5));
    }


}
