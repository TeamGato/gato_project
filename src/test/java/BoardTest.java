package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void boardStartsEmpty() {
        char[][] grid = board.getBoard();
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                assertEquals(' ', grid[row][col]);
    }

    @Test
    void cellAvailableInitially() {
        assertTrue(board.isCellAvailable(0, 0));
    }

    @Test
    void cellOccupiedAfterMove() {
        board.updateBoard(0, 0, 'X');
        assertFalse(board.isCellAvailable(0, 0));
    }

    @Test
    void updateBoardPlacesSymbolCorrectly() {
        board.updateBoard(1, 1, 'O');
        assertEquals('O', board.getBoard()[1][1]);
    }
}