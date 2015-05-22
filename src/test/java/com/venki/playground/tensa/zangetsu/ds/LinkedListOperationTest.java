package com.venki.playground.tensa.zangetsu.ds;

import static com.venki.playground.tensa.zangetsu.ds.LinkedListOperations.Node;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by vm023561 on 3/26/15.
 */
public class LinkedListOperationTest {

    @Test
    public void testLength() {
        Node node = new Node(100, new Node(200, new Node(300, new Node(400, null))));
        System.out.println(LinkedListOperations.getLength(node));
    }

    @Test
    public void testGNth() {
        Node node = new Node(100, new Node(200, new Node(300, new Node(400, null))));
        System.out.println(LinkedListOperations.getNth(node, 5));
    }

    @Test
    public void testSomething(){

        List<String> list = Lists.newArrayList();

        for(String string: list){
            System.out.println(string);
        }
    }



}
