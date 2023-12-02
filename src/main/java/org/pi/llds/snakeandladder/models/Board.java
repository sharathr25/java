package org.pi.llds.snakeandladder.models;

public class Board {
    private int start;
    private int end;

    public Board(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
