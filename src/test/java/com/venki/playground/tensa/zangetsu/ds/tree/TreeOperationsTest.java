package com.venki.playground.tensa.zangetsu.ds.tree;

import org.junit.Test;

import com.venki.playground.tensa.zangetsu.ds.tree.TreeOperations.Node;

/**
 * Created by vm023561 on 3/30/15.
 */
public class TreeOperationsTest {

    Node node = new Node(1);
    Node node1 = new Node(2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);
    Node node5 = new Node(6);
    Node node6 = new Node(7);

    @Test
    public void testGetSize() {
        node.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node.setRight(node4);
        node4.setLeft(node5);
        node4.setRight(node6);
        System.out.println(node);

    }

    @Test
    public void testPrintSize() {
        node.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node.setRight(node4);
        node4.setLeft(node5);
        node4.setRight(node6);
        System.out.println(TreeOperations.getSize(node));

    }

    @Test
    public void testPrintInOrder() {

        node.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node.setRight(node4);
        node4.setLeft(node5);
        node4.setRight(node6);
        TreeOperations.printInorder(node);
    }

    @Test
    public void testPrintPostOrder() {

        node.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node.setRight(node4);
        node4.setLeft(node5);
        node4.setRight(node6);
        TreeOperations.printPostorder(node);
    }
}
