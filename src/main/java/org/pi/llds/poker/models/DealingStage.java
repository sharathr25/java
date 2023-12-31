package org.pi.llds.poker.models;

public enum DealingStage {
    FLOP(3),
    TURN(1),
    RIVER(1);

    private final int numberOfCardsToDeal;


    DealingStage(int numberOfCardsToDeal) {
        this.numberOfCardsToDeal = numberOfCardsToDeal;
    }

    public int getNumberOfCardsToDeal() {
        return numberOfCardsToDeal;
    }
}
