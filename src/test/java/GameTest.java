package  tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Board board;
    private Game game;

    @BeforeEach
    void setUp() {
        board = new Board();
        game = new Game(board, null, null);
    }

    @Test
    public void testCheckWinnerHorizontal() {
        board.updateBoard(0, 0, 'X');
        board.updateBoard(0, 1, 'X');
        board.updateBoard(0, 2, 'X');

        assertTrue(game.checkWinner('X'));
    }

    @Test
    public void testCheckWinnerVertical() {
        board.updateBoard(0, 1, 'O');
        board.updateBoard(1, 1, 'O');
        board.updateBoard(2, 1, 'O');

        assertTrue(game.checkWinner('O'));
    }

    @Test
    public void testCheckWinnerDiagonal() {
        board.updateBoard(0, 0, 'X');
        board.updateBoard(1, 1, 'X');
        board.updateBoard(2, 2, 'X');

        assertTrue(game.checkWinner('X'));
    }

    @Test
    public void testCheckDrawWhenBoardFull() {
        char[] symbols = {'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X'};
        int symbolIndex = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board.updateBoard(row, col, symbols[symbolIndex]);
                symbolIndex++;
            }
        }

        assertTrue(game.checkDraw());
    }

    @Test
    public void testNoDrawWhenBoardHasEmptyCell() {
        assertFalse(game.checkDraw());
    }
}