package org.pi.llds.poker.models;

import java.util.Stack;

public class Deck {
    private Stack<Card> cards = new Stack<>();

    public Deck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit, false);
                cards.push(card);
            }
        }
    }

    public void shuffle() {
        Stack<Card> shuffledCards = new Stack<>();
        cards.stream().sorted((c1, c2) -> Double.compare(0.5, Math.random())).forEach(shuffledCards::push);
        cards = shuffledCards;
    }

    public Card topCard() {
        return cards.pop();
    }
}
