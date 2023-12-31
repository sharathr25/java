package org.pi.llds.poker;

import org.pi.llds.poker.models.Action;
import org.pi.llds.poker.models.Card;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(1000, 2);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if(table.isGameStarted()) {
                List<Action> availableActions = table.getAvailableActions();
                System.out.println(table.getCurrentPlayer().getName() + "'s turn:");
                for(int i = 0; i < availableActions.size(); i++) {
                    System.out.println((i + 1) + "." + availableActions.get(i));
                }
                if(!availableActions.isEmpty()) {
                    int choice = scanner.nextInt();
                    if(choice > availableActions.size()) throw new IllegalArgumentException();
                    Action action = availableActions.get(choice - 1);
                    switch (action) {
                        case BET -> {
                            System.out.println("Enter bets more than call amount");
                            int bets = scanner.nextInt();
                            scanner.nextLine();
                            table.bet(bets);
                        }
                        case CALL -> table.call();
                        case CHECK -> table.check();
                        case FOLD -> table.fold();
                    }
                }
                continue;
            }
            System.out.println("1. Add Player\n2. Start Game\n3. Exit\n4. Exit Game");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Enter player name: ");
                    String name = scanner.nextLine();
                    table.addPlayer(name);
                    break;
                }
                case 2: {
                    table.startGame();
                    break;
                }
                case 3:
                    return;
                case 4: {
                    table.endGame();
                }
            }
        }
    }

    private static String cardAsStr(Card card) {
        if (!card.isFacedUp()) return "#";
        String rankStr = switch (card.getRank()) {
            case ACE -> "A";
            case JACK -> "J";
            case QUEEN -> "Q";
            case KING -> "K";
            default -> Integer.toString(card.getRank().ordinal() + 1);
        };
        String suitStr = switch (card.getSuit()) {
            case CLUB -> "C";
            case DIAMOND -> "D";
            case HEART -> "H";
            case SPADE -> "S";
        };
        return rankStr + suitStr;
    }
}
