package tictactoe;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Menu menu = new Menu(scanner);
            Display display = new Display();
            Board board = new Board();
            String playerName = menu.playerName();
            Player player = new Player(playerName, 'X', scanner);



            display.welcome();
            menu.playerName();
            display.printBoard(board.getBoard());



        }

}
