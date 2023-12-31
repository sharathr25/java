package org.pi.llds.poker;

import org.pi.llds.poker.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table {
    private final int buyIn;
    private final int numberOfCardsToDeal;
    private final List<Player> players;
    private boolean isGameStarted;
    private Deck deck;
    private DealingStage stage;
    private Community community;
    private int playerTurnIndex;
    private int toCall;
    private int pot;
    private List<Action> availableActions = new ArrayList<>();

    Table(int buyIn, int numberOfCardsToDeal) {
        toCall = 0;
        pot = 0;
        community = new Community();
        players = new ArrayList<>();
        deck = new Deck();
        this.buyIn = buyIn;
        this.numberOfCardsToDeal = numberOfCardsToDeal;
    }

    private void dealPlayers() {
        for (int i = 0; i < numberOfCardsToDeal; i++) {
            players.forEach(player -> player.addCard(deck.topCard()));
        }
    }

    private void dealCommunity() {
        for (int i = 0; i < stage.getNumberOfCardsToDeal(); i++) {
            community.addCard(deck.topCard());
        }
        stage = nextStage();
    }

    private void shuffle() {
        deck.shuffle();
    }

    public void addPlayer(String name) {
        Player player = new Player(name, players.size(), buyIn);
        if (players.isEmpty()) player.setDealer(true);
        players.add(player);
    }

    private DealingStage nextStage() {
        return switch (stage) {
            case FLOP -> DealingStage.TURN;
            case TURN -> DealingStage.RIVER;
            case RIVER -> null;
        };
    }

    public void startGame() {
        isGameStarted = true;
        playerTurnIndex = 0;
        deck.shuffle();
        dealPlayers();
        availableActions.addAll(Arrays.asList(Action.values()));
    }

    public void endGame() {
        isGameStarted = false;
    }

    public boolean isGameStarted() {
        return isGameStarted;
    }

    public Player getCurrentPlayer() {
        return players.get(playerTurnIndex);
    }

    public int getToCall() {
        return toCall;
    }

    public void bet(int amount) {
        pot += amount;
    }

    public void check() {

    }

    public void call() {
        pot += toCall;
    }

    public void fold() {

    }

    public List<Action> getAvailableActions() {
        return availableActions;
    }
}
