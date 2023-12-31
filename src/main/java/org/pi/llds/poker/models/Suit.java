package org.pi.llds.poker.models;

public enum Suit {
    CLUB,
    DIAMOND,
    HEART,
    SPADE;

    @Override
    public String toString() {
        return switch(this) {
            case CLUB -> "C";
            case DIAMOND -> "D";
            case HEART -> "H";
            case SPADE -> "S";
        };
    }
}
