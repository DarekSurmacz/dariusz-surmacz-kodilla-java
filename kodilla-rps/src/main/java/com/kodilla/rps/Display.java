package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.kodilla.rps.Rps.rps;

public class Display {
    private String playerName;
    private int rounds;
    private int gameMode;
    private int difficulty;

    public void playerNameSetter() {
        System.out.println("Welcome to Rock-Paper-Scissors / Rock-Paper-Scissors-Lizard-Spock");
        System.out.println("Enter your name:");
        System.out.println("Press ENTER to confirm");
        Scanner userNameScan = new Scanner(System.in);
        playerName = userNameScan.next();
        System.out.println("Welcome " + playerName + "!");
    }

    public int roundsSetter() {
        System.out.println("Enter amount of rounds required to win:");
        System.out.println("Press ENTER to confirm");
        Scanner roundsScan = new Scanner(System.in);
            try {
                rounds = roundsScan.nextInt();
                return rounds;
            } catch (InputMismatchException e) {
                System.out.println("ENTER A NUMBER!");
                return new Scanner(System.in).nextInt();
            }
        }

    public int gameModeSetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select figures list: \nPress 1 to choose Normal (Rock - Paper - Scissors)" +
                    " \nPress 2 to choose Extended (Rock - Paper - Scissors - Lizard - Spock)");
            System.out.println("Press ENTER to confirm");
            int s = scanner.nextInt();
            switch (s) {
                case 1:
                    return gameMode = 1;
                case 2:
                    return gameMode = 2;
                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public int difficultySetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select difficulty level:" +
                    " \nPress 1 to choose Normal \nPress 2 to choose Hard (computer cheating)");
            System.out.println("Press ENTER to confirm");
            int s = scanner.nextInt();
            switch (s) {
                case 1:
                    return difficulty = 1;
                case 2:
                    return difficulty = 2;
                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public static void displayGameSettings(String userName, int roundsAmt, int gameMode, int difficultyLevel) {
        String gameModeString = (gameMode != 1) ? "Extended" : "Normal";
        String difficultyString = (difficultyLevel != 1) ? "Unfair" : "Normal";

        System.out.println("Get ready " + userName + "! Rounds amount was set to " + roundsAmt
                + ". Figures list was set to " + gameModeString + ". Difficulty level was set to " + difficultyString + ".");
    }

    public static Buttons getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to choose Rock   Press 2 to choose Paper   Press 3 to choose Scissors");
            System.out.println("Press X to end the game   Press N to start a new game   Press R to display rules");
            System.out.println("Press ENTER to confirm");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "1":
                    return Buttons.ROCK;
                case "2":
                    return Buttons.PAPER;
                case "3":
                    return Buttons.SCISSORS;
                case "X":
                    return Buttons.QUIT;
                case "N":
                    return Buttons.NEW_GAME;
                case "R":
                    return Buttons.DISPLAY_RULES;

                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public static Buttons getExtendedUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to choose Rock   Press 2 to choose Paper   Press 3 to choose Scissors");
            System.out.println("Press 4 to choose Lizard   Press 5 to choose Spock");
            System.out.println("Press X to end the game   Press N to start a new game   Press R to display rules");
            System.out.println("Press ENTER to confirm");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "1":
                    return Buttons.ROCK;
                case "2":
                    return Buttons.PAPER;
                case "3":
                    return Buttons.SCISSORS;
                case "4":
                    return Buttons.LIZARD;
                case "5":
                    return Buttons.SPOCK;
                case "R":
                    return Buttons.DISPLAY_RULES;
                case "N":
                    return Buttons.NEW_GAME;
                case "X":
                    return Buttons.QUIT;

                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public static void showMoves(String userName, Buttons playerMove, Buttons compMove, Score score) {
        System.out.println(userName + " move: " + playerMove + ", Computer move: " + compMove + "\nRound result: " + score);
    }

    public static void showScoreboard(String userName, int playerWins, int computerWins, int roundCount) {
        System.out.println("Player " + userName + " wins: " + playerWins + "   Computer wins: " + computerWins +
                "   Rounds played: " + roundCount);
    }

    public static void showFinalScore(int playerWins, int computerWins) {
        if (playerWins > computerWins) {
            System.out.println("--------\nYOU WON!\n--------");
        } else if (computerWins > playerWins) {
            System.out.println("---------\nYOU LOSE!\n---------");
        } else {
            System.out.println("---------\nIT'S A DRAW!\n---------");
        }
    }

    public static void showNormalRules() {
        System.out.println("Scissors cuts Paper\n" +
                "Paper covers Rock\n" +
                "and Rock crushes Scissors.");
    }

    public static void showExtendedRules() {
        System.out.println("Scissors cuts Paper\n" +
                "Paper covers Rock\n" +
                "Rock crushes Lizard\n" +
                "Lizard poisons Spock\n" +
                "Spock smashes Scissors\n" +
                "Scissors decapitates Lizard\n" +
                "Lizard eats Paper\n" +
                "Paper disproves Spock\n" +
                "Spock vaporizes Rock\n" +
                "(and as it always has) Rock crushes Scissors");
    }

    public static void newGame() {
        boolean isNewGame = true;
        System.out.println("Do you want to start a new game?\n" +
                "Press Y to start a new game   Press N to exit\n" +
                "Press ENTER to confirm");
        while (isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    rps();
                case "N":
                    System.out.println("End of the game.");
                    isNewGame = false;
                    break;
                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public static void quit() {
        System.out.println("Are you sure that you want end this game?");
        System.out.println("Press Y to exit   Press N to continue playing");
        System.out.println("Press ENTER to confirm");
        boolean end = false;
        while (!end) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.out.println("End of the game.");
                    System.exit(0);
                case "N":
                    System.out.println("Resuming the game.");
                default:
                    System.out.println("WRONG BUTTON!");
            }
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRounds() {
        return rounds;
    }

    public int getGameMode() {
        return gameMode;
    }

    public int getDifficulty() {
        return difficulty;
    }
}