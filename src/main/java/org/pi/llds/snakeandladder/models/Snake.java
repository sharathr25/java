package org.pi.llds.snakeandladder.models;

public class Snake {
    private final int head;
    private final int tail;
    private final int id;

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getId() {
        return id;
    }

    public Snake(int head, int tail, int id) {
        this.head = head;
        this.tail = tail;
        this.id = id;
    }
}
