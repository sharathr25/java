package org.pi.datastructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    LinkedList() {
        head = null;
    }

    void appendToTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    Node head() {
        return head;
    }

    int deleteTailNode() {
        Node cur = head;
        Node prev = cur;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        int data = prev.next == null ? null : prev.next.data;
        prev.next = null;
        return data;
    }

    void deleteMiddleNode() {
        Node runner = head;
        Node slowRunner = head;
        Node prevOfSlowRunner = head;
        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            prevOfSlowRunner = slowRunner;
            slowRunner = slowRunner.next;
        }
        prevOfSlowRunner.next = slowRunner.next;
    }

    void displayNodes() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + (cur.next == null ? "" : "->"));
            cur = cur.next;
        }
        System.out.println();
    }

    void removeDuplicates() {
        Set<Integer> s = new HashSet<Integer>();

        Node cur = head;
        Node prev = cur;
        while(cur != null) {
            if(s.contains(cur.data)) {
                prev.next = cur.next;
            } else {
                s.add(cur.data);
                prev = cur;
            }
            cur = cur.next;
        }
    }

    void removeDuplicatesV2() { // O(n^2) slow
        Node cur = head;
        while (cur.next != null) {
            Node runner = cur.next;
            Node prev = cur;
            while (runner != null) {
                if(cur.data == runner.data) {
                    prev.next = runner.next;
                } else {
                    prev = runner;
                }
                runner = runner.next;
            }
            cur = cur.next;
        }
    }

    int getKthLastNode(int k) {
        Node cur = head;
        Node runner = cur;
        while (cur != null) {
            cur = cur.next;
            if(k == 0) {
                runner = runner.next;
            } else {
                k--;
            }
        }
        return runner.data;
    }

    void partition(int p) {
        Node minStart = null;
        Node minEnd = null;
        Node maxStart = null;
        Node maxEnd = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = null;
            if(cur.data < p) {
                if(minStart == null) {
                    minStart = cur;
                    minEnd = minStart;
                } else {
                    minEnd.next = cur;
                    minEnd = cur;
                }
            } else {
                if(maxStart == null) {
                    maxStart = cur;
                    maxEnd = maxStart;
                } else {
                    maxEnd.next = cur;
                    maxEnd = cur;
                }
            }
            cur = next;
        }
        if(minStart == null) {
            head = maxStart;
        } else {
            minEnd.next = maxStart;
            head = minStart;
        }

    }

    int getNumberFromLinkedList(LinkedList l) {
        int n = 0;
        int base = 10;
        int i = 1;
        Node cur = l.head();
        while (cur != null) {
            n += i * cur.data;
            i *= base;
            cur = cur.next;
        }
        return n;
    }

    void reverseList() {
        Node prev = head;
        Node cur = head.next;
        while (cur!= null) {
            Node next = cur.next;
            Node temp = cur;
            temp.next = head;
            prev.next = next;
            head = temp;
            cur = next;
        }
    }

    LinkedList getLinkedListFromNumber(int n) {
        LinkedList l = new LinkedList();

        while (n != 0) {
            l.appendToTail(n % 10);
            n = n / 10;
        }

        return l;
    }

    LinkedList sumListReverseOrder(LinkedList l) {
        int sum = getNumberFromLinkedList(this) + getNumberFromLinkedList(l);
        LinkedList sumList = getLinkedListFromNumber(sum);
        sumList.reverseList();
        return sumList;
    }

    LinkedList sumListForwardOrder(LinkedList l) {
        LinkedList temp1 = this;
        LinkedList temp2 = l;
        temp1.reverseList();
        temp2.reverseList();
        int sum = getNumberFromLinkedList(temp1) + getNumberFromLinkedList(temp2);
        LinkedList sumList = getLinkedListFromNumber(sum);
        sumList.reverseList();
        return sumList;
    }
}

