package org.pi.llds.poker.models;

public class Card {
    private final Suit suit;
    private final Rank rank;
    private boolean isFacedUp;

    public Card(Rank rank, Suit suit, boolean isFacedUp) {
        this.suit = suit;
        this.rank = rank;
        this.isFacedUp = isFacedUp;
    }

    public Suit getSuit() {
        return isFacedUp ? suit : null;
    }

    public Rank getRank() {
        return isFacedUp ? rank : null;
    }

    public boolean isFacedUp() {
        return isFacedUp;
    }

    public void setFacedUp(boolean facedUp) {
        isFacedUp = facedUp;
    }
}
