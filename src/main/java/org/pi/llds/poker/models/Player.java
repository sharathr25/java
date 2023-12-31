package org.pi.llds.poker.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final int id;
    private int chips;
    private List<Card> cards;
    private boolean isDealer;
    private List<TurnAction> turnActions;

    public Player(String name, int id, int chips) {
        this.name = name;
        this.id = id;
        this.chips = chips;
        this.isDealer = false;
        cards = new ArrayList<>();
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void addTurnAction(TurnAction turnAction) {
        turnActions.add(turnAction);
    }
}
