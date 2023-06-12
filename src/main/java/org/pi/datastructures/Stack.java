/*
 * Copyright (c) 2023 Network International.
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 */
 
package org.pi.datastructures;
public class Stack {
    LinkedList list;

    Stack() {
        this.list = new LinkedList();
    }

    void push(int val) {
        list.appendToTail(val);
    }

    int pop() {
        return list.deleteTailNode();
    }
}
