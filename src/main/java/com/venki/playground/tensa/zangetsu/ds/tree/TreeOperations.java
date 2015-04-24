package com.venki.playground.tensa.zangetsu.ds.tree;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import com.venki.playground.tensa.zangetsu.ds.LinkedListOperations;

/**
 * Created by vm023561 on 3/30/15.
 */
public class TreeOperations {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            Node node = (Node) o;

            if (data != node.data)
                return false;
            if (!left.equals(node.left))
                return false;
            if (!right.equals(node.right))
                return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = data;
            result = 31 * result + left.hashCode();
            result = 31 * result + right.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", left=" + left + ", right=" + right + '}';
        }
    }

    public static int getSize(Node node) {
        if (node == null) {
            return 0;
        }

        return getSize(node.getLeft()) + 1 + getSize(node.getRight());
    }

    public static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.getLeft());
        System.out.println(node.getData());
        printInorder(node.getRight());
    }

    public static void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.getLeft());
        printInorder(node.getRight());

        System.out.println(node.getData());
    }

    public static Node createArrayToBinarySearchTree(int[] array, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node node = new Node(array[mid]);
        node.setLeft(createArrayToBinarySearchTree(array, start, mid - 1));
        node.setRight(createArrayToBinarySearchTree(array, mid + 1, end));

        return node;
    }

    public static Node createLinkedListToBinarySearchTree(LinkedListOperations.Node node) {
        return null;
    }

    public static void printByLevel(final Node node) {
        if (node == null) {
            return;
        } else {
            int level = 0;
            Queue<Node> queue = new ArrayBlockingQueue<Node>(getSize(node));
            queue.add(node);
            while (!queue.isEmpty()) {
                Node value = queue.remove();
                if (value.getLeft() != null) {
                    queue.add(value.getLeft());
                }
                if (value.getLeft() != null) {
                    queue.add(value.getRight());
                }
                System.out.println("Level " + level++ + ":" + value.getData());

            }

        }
    }
}
