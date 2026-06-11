package tictactoe;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Menu menu = new Menu(scanner);
            Display display = new Display();
            Board board = new Board();




            display.welcome();
            String playerName = menu.playerName();
            Player player = new Player(playerName, 'X', scanner, true);
            Player machine = new Player("Ordenador", 'O', scanner, false);

            display.printBoard(board.getBoard());

            Turn turn = new Turn(player, machine);
            Game game = new Game(board, display, turn);
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();
            game.play();

        }
}