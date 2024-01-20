package org.pi.codewithmoshdatastructures;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first  = second;
        }
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            Node prevOfLast = first;
            while (prevOfLast.next != last) {
                prevOfLast = prevOfLast.next;
            }
            last = prevOfLast;
            last.next = null;
        }
    }

    public int indexOf(int item) {
        Node cur = first;
        int index = 0;
        while (cur != null) {
            if (cur.value == item) return index;
            cur = cur.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void print() {
        Node cur = first;
        while (cur != null) {
            System.out.print(cur.value + (cur.next == null ? "" : " ->"));
            cur = cur.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return first == null;
    }
}
