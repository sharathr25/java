package org.pi.llds.snakeandladder;

import org.pi.llds.snakeandladder.models.Game;
import org.pi.llds.snakeandladder.models.Player;

import java.util.Scanner;

public class SnakeLadderApplication {
    private static final int BOARD_SIZE = 5;
    private static final int DICE_MIN_VALUE = 1;
    private static final int DICE_MAX_VALUE = 6;
    private static final int NUMBER_OF_SNAKES = 2;
    private static final int NUMBER_OF_LADDERS = 2;

    public static void main(String[] args) {
        Game game = new Game();
        GameCore gameCore = new GameCore(BOARD_SIZE, BOARD_SIZE, DICE_MIN_VALUE, DICE_MAX_VALUE,
                NUMBER_OF_SNAKES, NUMBER_OF_LADDERS, game);
        Scanner scanner = new Scanner(System.in);
        addPlayers(scanner, gameCore);
        runGame(scanner, gameCore, game);
    }

    private static void runGame(Scanner scanner, GameCore gameCore, Game game) {
        while (true) {
            if (game.isGameOver()) {
                System.out.println("Game over");
                for (Player player : game.getPlayers()) {
                    System.out.println(player.getWinPos() + "." + player.getName());
                }
                break;
            }
            Player player = game.getCurrentPlayer();
            System.out.println(player.getName() + " Rolling dice, Press enter to roll");
            scanner.nextLine();
            gameCore.play();
            System.out.println(player.getPosition() + " Is Your new position");
        }
    }

    private static void addPlayers(Scanner scanner, GameCore gameCore) {
        System.out.println("Enter number of players");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " player name");
            String name = scanner.nextLine();
            Player player = new Player(i + 1, name);
            gameCore.addPlayer(player);
        }
    }
}
