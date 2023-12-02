package org.pi.llds.snakeandladder.models;

public class Player {
    private int position;
    private int id;
    private String name;
    private int winPos;
    private boolean finished;

    public int getWinPos() {
        return winPos;
    }

    public void setWinPos(int winPos) {
        this.winPos = winPos;
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.position = 0;
        this.winPos = 0;
    }

    public int getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int position) {
        this.position = position;
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }
}
