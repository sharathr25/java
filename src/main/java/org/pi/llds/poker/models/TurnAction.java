package org.pi.llds.poker.models;

public class TurnAction {
    Action action;
    int bets;

    public TurnAction(Action action, int bets) {
        this.action = action;
        this.bets = bets;
    }
}
