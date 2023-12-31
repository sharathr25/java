package org.pi.llds.poker.models;

import java.util.Stack;

public class Community {
    private final Stack<Card> communityCards;

    public Community() {
        communityCards = new Stack<>();
    }

    public void addCard(Card card) {
        communityCards.push(card);
    }

    public Stack<Card> getCommunityCards() {
        return communityCards;
    }
}
