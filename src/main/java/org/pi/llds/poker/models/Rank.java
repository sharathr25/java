package org.pi.llds.poker.models;

public enum Rank {
    ACE,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        return switch (this) {
            case ACE -> "A";
            case JACK -> "J";
            case QUEEN -> "Q";
            case KING -> "K";
            default -> Integer.toString(this.ordinal() + 1);
        };
    }
}
