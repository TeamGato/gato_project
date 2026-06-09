package tictactoe;

// tablero 3x3 y actualización de los movimientos
public class Board {

   private char[][] board;

    public Board() {
        board = new char[3][3];
        for (int row =  0; row < 3; row++ ) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }
    public char[][] getBoard() {
        return board;
    }
}
