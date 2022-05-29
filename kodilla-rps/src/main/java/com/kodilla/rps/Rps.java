package com.kodilla.rps;


public class Rps {

    public static void main(String[] args) {
        rps();
    }

    public static void rps() {
        Display display = new Display();

        display.playerNameSetter();
        display.roundsSetter();
        display.gameModeSetter();
        display.difficultySetter();

        Display.displayGameSettings(
                display.getPlayerName(),
                display.getRounds(),
                display.getGameMode(),
                display.getDifficulty());

        Logic.gameEngine(
                display.getPlayerName(),
                display.getRounds(),
                display.getGameMode(),
                display.getDifficulty());

        Display.newGame();
    }
}