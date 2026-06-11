package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestBoard {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void tableroIniciaVacio() {
        char[][] grid = board.getBoard();
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                assertEquals(' ', grid[row][col]);
    }

    @Test
    void casillaDisponibleInicialmente() {
        assertTrue(board.isCellAvailable(0, 0));
    }

    @Test
    void casillaOcupadaTrasMovimiento() {
        board.updateBoard(0, 0, 'X');
        assertFalse(board.isCellAvailable(0, 0));
    }

    @Test
    void updateBoardColocaSimboloCorrectamente() {
        board.updateBoard(1, 1, 'O');
        assertEquals('O', board.getBoard()[1][1]);
    }
}