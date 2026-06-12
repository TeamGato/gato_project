package tictactoe;

/**
 * Manages player turns in the Tic-Tac-Toe game.
 * Keeps track of the current player and switches between player 1 and player 2 after each move.
 */

public class Turn {

    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Turn(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
}