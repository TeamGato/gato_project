package tictactoe;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Menu menu = new Menu(scanner);
            Display display = new Display();

            display.welcome();
            menu.playerName();

        }
}
