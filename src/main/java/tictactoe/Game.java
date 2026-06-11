package tictactoe;
//Elegir la casilla
//Lógica de la partida ( estado de las fichas)
//Lógica estado final de la partida (ganador, perdedor, empate)
public class Game {
    private Board board;
    private Display display;
    private Turn turn ;

    public Game(Board board, Display display, Turn turn) {
        this.board = board;
        this.display = display;
        this.turn = turn;
    }
    public void play() {
        Player current = turn.getCurrentPlayer();
        System.out.println("Turno de: " + current.getName());
        current.move(board);
        display.printBoard(board.getBoard());
        turn.switchTurn();
    }
}