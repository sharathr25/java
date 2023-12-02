package org.pi.llds.snakeandladder;

import org.pi.llds.snakeandladder.models.*;
import org.pi.llds.snakeandladder.utils.RandGen;
import org.pi.llds.snakeandladder.utils.Utils;

import java.util.*;

public class GameCore {
    Game game;
    private final Queue<Integer> playersQueue = new ArrayDeque<>();
    private final Map<Integer, Integer> snakes = new HashMap<>();
    private final Map<Integer, Integer> ladders = new HashMap<>();
    private int winPos = 1;

    public GameCore(int boardRows, int boardCols, int diceMin, int diceMax, int numberOfSnakes, int numberOfLadders, Game game) {
        int boardStart = 1;
        int boardEnd = boardRows * boardCols;
        Board board = new Board(boardStart, boardEnd);
        List<Snake> snakeList = new ArrayList<>();
        List<Ladder> ladderList = new ArrayList<>();
        RandGen randGen = new RandGen();
        for (int i = 0; i < numberOfSnakes; i++) {
            int tail = randGen.getRandNum(boardStart, boardEnd / 2);
            int head = randGen.getRandNum(boardEnd / 2 + 1, boardEnd);
            Snake snake = new Snake(head, tail, i + 1);
            snakeList.add(snake);
            snakes.put(head, tail);
        }
        for (int i = 0; i < numberOfLadders; i++) {
            int bottom = randGen.getRandNum(boardStart, boardEnd / 2);
            int top = randGen.getRandNum(boardEnd / 2 + 1, boardEnd);
            Ladder ladder = new Ladder(top, bottom, i + 1);
            ladderList.add(ladder);
            ladders.put(bottom, top);
        }

        Dice dice = new Dice(diceMin, diceMax);

        game.setBoard(board);
        game.setDice(dice);
        game.setLadders(ladderList);
        game.setSnakes(snakeList);
        game.setPlayers(new ArrayList<>());
        this.game = game;
    }

    public void addPlayer(Player player) {
        List<Player> players = game.getPlayers();
        playersQueue.add(players.size());
        players.add(player);
        game.setCurrentPlayer(currentPlayer());
    }

    public void play() {
        if (playersQueue.isEmpty()) {
            System.out.println("Can't start game. No players");
            return;
        }
        rollDice();
        movePosition();
        checkPlayerWon();
        moveTurn();
        checkGameOver();
    }

    private void rollDice() {
        Dice dice = game.getDice();
        int roll = Utils.getRandomNum(dice.getMinValue(), dice.getMaxValue());
        System.out.println("Rolled: " + roll);
        dice.setCurrentVal(roll);
    }

    private void movePosition() {
        Player player = currentPlayer();
        int newPos = player.getPosition() + game.getDice().getCurrentVal();
        int boardEnd = game.getBoard().getEnd();
        if (newPos <= boardEnd) {
            player.setPosition(newPos);
            if (snakes.containsKey(newPos)) {
                int tail = snakes.get(newPos);
                System.out.println("Snake bite :( " + newPos + "->" + tail);
                player.setPosition(tail);
            } else if (ladders.containsKey(newPos)) {
                int top = ladders.get(newPos);
                System.out.println("Got Ladder :) " + newPos + "->" + top);
                player.setPosition(top);
            }
        }
    }

    private void moveTurn() {
        Player player = currentPlayer();
        if (player != null && player.getWinPos() == 0) {
            playersQueue.add(playersQueue.poll());
        } else {
            playersQueue.poll();
        }
        game.setCurrentPlayer(currentPlayer());
    }

    private void checkPlayerWon() {
        Player player = currentPlayer();
        if (player != null && player.getPosition() == game.getBoard().getEnd()) {
            player.setWinPos(winPos++);
        }
    }

    private void checkGameOver() {
        if (playersQueue.isEmpty()) {
            game.setGameOver(true);
        }
    }

    private Player currentPlayer() {
        Integer peek = playersQueue.peek();
        if (peek == null) return null;
        return game.getPlayers().get(peek);
    }
}
