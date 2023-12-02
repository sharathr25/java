package org.pi.llds.snakeandladder.models;

public class Ladder {
    private final int top;
    private final int bottom;
    private final int id;

    public Ladder(int top, int bottom, int id) {
        this.top = top;
        this.bottom = bottom;
        this.id = id;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getId() {
        return id;
    }
}
