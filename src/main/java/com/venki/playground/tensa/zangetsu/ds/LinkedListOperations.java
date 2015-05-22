package com.venki.playground.tensa.zangetsu.ds;

/**
 * Created by vm023561 on 3/26/15.
 */
public class LinkedListOperations {

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
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
            if (next != null ? !next.equals(node.next) : node.next != null)
                return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = data;
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }

    public static int getLength(Node head) {

        int count = 0;
        while (head != null) {
            ++count;
            head = head.getNext();
        }
        return count;
    }

    public static int getNth(Node head, int n) {

        int count = 0;
        while (head != null) {
            if (count == n) {
                return head.getData();
            }
            ++count;
            head = head.getNext();

        }
        return -1;
    }

    public static Node MergeLists(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.data < list2.data) {
            list1.next = MergeLists(list1.next, list2);
            return list1;
        } else {
            list2.next = MergeLists(list2.next, list1);
            return list2;
        }
    }

    public static int getMiddle(Node list) {

        Node current = list;
        int length = 0;
        Node middle = list;

        while (current.getNext() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.getNext();
            }
            current = current.getNext();
        }

        if (length % 2 == 1) {
            middle = middle.getNext();
        }

        return 0;
    }

    public static void insertNth(Node head, int n, int data) {
        int count = 0;
        while (head != null) {

            if (n == count) {
                Node next = head.getNext();
                Node nth = new Node(data, next);
                head.next = nth;

            }
            count++;
            head = head.getNext();
        }
    }

    public void reverse(final Node head) {

        if (head == null) {
            return;
        }

        Node reverse = null;
        Node current = head;
        // 1->2->3
        while (head.getNext() != null) {

            // null
            Node next = current.getNext();
            // 3-2-1
            current.setNext(reverse);
            // 2-3
            reverse = current;
            // 3
            current = next;

        }
    }
}
