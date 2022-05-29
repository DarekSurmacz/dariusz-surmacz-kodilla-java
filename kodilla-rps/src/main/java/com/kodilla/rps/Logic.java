package com.kodilla.rps;

public class Logic {
    public static Score compareChoices(Buttons playerMove, Buttons computerMove) {
        if (playerMove == computerMove) {
            return Score.DRAW;
        } else if (playerMove == Buttons.ROCK && computerMove == Buttons.PAPER) {
            return Score.LOSE;
        } else if (playerMove == Buttons.ROCK && computerMove == Buttons.SPOCK) {
            return Score.LOSE;
        } else if (playerMove == Buttons.PAPER && computerMove == Buttons.SCISSORS) {
            return Score.LOSE;
        } else if (playerMove == Buttons.PAPER && computerMove == Buttons.LIZARD) {
            return Score.LOSE;
        } else if (playerMove == Buttons.SCISSORS && computerMove == Buttons.ROCK) {
            return Score.LOSE;
        } else if (playerMove == Buttons.SCISSORS && computerMove == Buttons.SPOCK) {
            return Score.LOSE;
        } else if (playerMove == Buttons.LIZARD && computerMove == Buttons.ROCK) {
            return Score.LOSE;
        } else if (playerMove == Buttons.LIZARD && computerMove == Buttons.SCISSORS) {
            return Score.LOSE;
        } else if (playerMove == Buttons.SPOCK && computerMove == Buttons.PAPER) {
            return Score.LOSE;
        } else if (playerMove == Buttons.SPOCK && computerMove == Buttons.LIZARD) {
            return Score.LOSE;
        } else {
            return Score.WIN;
        }
    }

    public static void gameEngine(String userName, int roundsAmt, int gameMode, int difficulty) {
        int playerWins = 0;
        int computerWins = 0;
        int roundCounter = 0;

        while ((playerWins < roundsAmt) && (computerWins < roundsAmt)) {
            ComputerMoves computer = new ComputerMoves();
            if (gameMode == 1) {
                Buttons playerMove = Display.getUserSelection();
                Buttons computerMove = computer.getComputerMove(difficulty, gameMode, playerMove);
                if (playerMove == Buttons.DISPLAY_RULES) {
                    Display.showNormalRules();
                } else if (playerMove == Buttons.QUIT) {
                    Display.quit();
                } else if (playerMove == Buttons.NEW_GAME) {
                    Display.newGame();
                } else {
                    Score score = compareChoices(playerMove, computerMove);
                    roundCounter++;
                    if (score == Score.DRAW) {
                        Display.showMoves(userName, playerMove, computerMove, score);
                    } else if (score == Score.WIN) {
                        Display.showMoves(userName, playerMove, computerMove, score);
                        playerWins++;
                    } else {
                        Display.showMoves(userName, playerMove, computerMove, score);
                        computerWins++;
                    }
                    Display.showScoreboard(userName, playerWins, computerWins, roundCounter);
                }
            } else {
                Buttons playerMove = Display.getExtendedUserSelection();
                Buttons computerMove = computer.getComputerMove(difficulty, gameMode, playerMove);
                if (playerMove == Buttons.DISPLAY_RULES) {
                    Display.showExtendedRules();
                } else if (playerMove == Buttons.QUIT) {
                    Display.quit();
                } else if (playerMove == Buttons.NEW_GAME) {
                    Display.newGame();
                } else {
                    Score score = compareChoices(playerMove, computerMove);
                    roundCounter++;
                    if (score == Score.DRAW) {
                        Display.showMoves(userName, playerMove, computerMove, score);
                    } else if (score == Score.WIN) {
                        Display.showMoves(userName, playerMove, computerMove, score);
                        playerWins++;
                    } else {
                        Display.showMoves(userName, playerMove, computerMove, score);
                        computerWins++;
                    }
                    Display.showScoreboard(userName, playerWins, computerWins, roundCounter);
                }
            }
        }
        Display.showFinalScore(playerWins, computerWins);
    }
}