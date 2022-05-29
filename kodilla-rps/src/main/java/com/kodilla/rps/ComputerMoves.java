package com.kodilla.rps;

public class ComputerMoves {
    public Buttons getComputerMove(int difficulty, int gameMode, Buttons playerMove){
        ComputerInput computerInput = new ComputerInput();
        Buttons comNormal = null;
        if (gameMode == 1 && difficulty == 1) {
            int comMove = computerInput.getNormalComputerInput();
            if (comMove == 1) {
                comNormal = Buttons.ROCK;
            } else if (comMove == 2) {
                comNormal = Buttons.PAPER;
            } else {
                comNormal = Buttons.SCISSORS;
            }
        } else if (gameMode == 1 && difficulty == 2 ) {
            int comUnfair = computerInput.getUnfairComputerInput();
            if (playerMove == Buttons.PAPER) {
                if (comUnfair <= 30) {
                    comNormal = Buttons.ROCK;
                } else if (comUnfair <= 60) {
                    comNormal = Buttons.PAPER;
                } else {
                    comNormal = Buttons.SCISSORS;
                }
            } else if (playerMove == Buttons.ROCK) {
                if (comUnfair <= 30) {
                    comNormal = Buttons.SCISSORS;
                } else if (comUnfair <= 60) {
                    comNormal = Buttons.ROCK;
                } else {
                    comNormal = Buttons.PAPER;
                }
            } else {
                if (comUnfair <= 30) {
                    comNormal = Buttons.PAPER;
                } else if (comUnfair <= 60) {
                    comNormal = Buttons.SCISSORS;
                } else {
                    comNormal = Buttons.ROCK;
                }
            }
        } else if (gameMode == 2 && difficulty == 1 ) {
            int comMove = computerInput.getExtendedComputerInput();
            if (comMove == 1) {
                comNormal = Buttons.ROCK;
            } else if (comMove == 2) {
                comNormal = Buttons.PAPER;
            } else if (comMove == 3) {
                comNormal = Buttons.SCISSORS;
            } else if (comMove == 4) {
                comNormal = Buttons.LIZARD;
            } else {
                comNormal = Buttons.SPOCK;
            }
        } else if (gameMode == 2 && difficulty == 2 ) {
            int comMoveHard = computerInput.getUnfairComputerInput();
            if (playerMove == Buttons.PAPER) {
                if (comMoveHard <= 15) {
                    comNormal = Buttons.ROCK;
                } else if (comMoveHard <= 30) {
                    comNormal = Buttons.SPOCK;
                } else if (comMoveHard <= 55) {
                    comNormal = Buttons.PAPER;
                } else if (comMoveHard <= 80) {
                    comNormal = Buttons.SCISSORS;
                } else {
                    comNormal = Buttons.LIZARD;
                }
            } else if (playerMove == Buttons.ROCK) {
                if (comMoveHard <= 15) {
                    comNormal = Buttons.SCISSORS;
                } else if (comMoveHard <= 30) {
                    comNormal = Buttons.LIZARD;
                } else if (comMoveHard <= 55) {
                    comNormal = Buttons.ROCK;
                } else if (comMoveHard <= 80) {
                    comNormal = Buttons.PAPER;
                } else {
                    comNormal = Buttons.SPOCK;
                }
            } else if (playerMove == Buttons.SCISSORS) {
                if (comMoveHard <= 15) {
                    comNormal = Buttons.PAPER;
                } else if (comMoveHard <= 30) {
                    comNormal = Buttons.LIZARD;
                } else if (comMoveHard <= 55) {
                    comNormal = Buttons.SCISSORS;
                } else if (comMoveHard <= 80) {
                    comNormal = Buttons.ROCK;
                } else {
                    comNormal = Buttons.SPOCK;
                }
            } else if (playerMove == Buttons.LIZARD) {
                if (comMoveHard <= 15) {
                    comNormal = Buttons.PAPER;
                } else if (comMoveHard <= 30) {
                    comNormal = Buttons.SPOCK;
                } else if (comMoveHard <= 55) {
                    comNormal = Buttons.LIZARD;
                } else if (comMoveHard <= 80) {
                    comNormal = Buttons.ROCK;
                } else {
                    comNormal = Buttons.SCISSORS;
                }
            } else {
                if (comMoveHard <= 15) {
                    comNormal = Buttons.SCISSORS;
                } else if (comMoveHard <= 30) {
                    comNormal = Buttons.ROCK;
                } else if (comMoveHard <= 55) {
                    comNormal = Buttons.SPOCK;
                } else if (comMoveHard <= 80) {
                    comNormal = Buttons.PAPER;
                } else {
                    comNormal = Buttons.LIZARD;
                }
            }
        } return comNormal;
    }
}