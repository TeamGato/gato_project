package tictactoe;

//Elegir la casilla
//Lógica de la partida ( estado de las fichas)
//Lógica estado final de la partida (ganador, perdedor, empate)
public class Game {
    private Board board;
    private Display display;
    private Turn turn;

    public Game(Board board, Display display, Turn turn) {
        this.board = board;
        this.display = display;
        this.turn = turn;
    }

    public void play() {
        boolean gameOver = false;

        while (!gameOver) {
            Player current = turn.getCurrentPlayer();
            System.out.println("Turno de: " + current.getName());
            current.move(board);
            display.printBoard(board.getBoard());

            if (checkWinner(current.getSymbol())) {
                System.out.println("¡" + current.getName() + " ha ganado!");
                gameOver = true;
            } else if (checkDraw()) {
                System.out.println("Empate");
                gameOver = true;
            } else {
                turn.switchTurn();
            }
        }
    }

    public boolean checkWinner(char symbol) {
        char[][] b = board.getBoard();

        for (int row = 0; row < 3; row++) {
            if (b[row][0] == symbol && b[row][1] == symbol && b[row][2] == symbol) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (b[0][col] == symbol && b[1][col] == symbol && b[2][col] == symbol) {
                return true;
            }
        }

        if (b[0][0] == symbol && b[1][1] == symbol && b[2][2] == symbol) {
            return true;
        }

        if (b[0][2] == symbol && b[1][1] == symbol && b[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        char[][] b = board.getBoard();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (b[row][col] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}
