package tictactoe;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Menu menu = new Menu(scanner);
            boolean running = true;

            App.init(scanner, menu);
            while (running) {
                String option = menu.menuRestart();
                switch (option) {
                    case "1":
                        App.init(scanner, menu);
                        break;
                    case "2":
                        System.out.println("¡Hasta luego, vuelve pronto!");
                        running = false;
                        break;
                    default:
                        System.out.println("Opción no válida, inténtalo de nuevo.\n");
                }
            }
            scanner.close();
        }

        private static void init(Scanner scanner, Menu menu) {
            Display display = new Display();
            Board board = new Board();
            display.welcome();
            String playerName = menu.playerName();
            Player player = new Player(playerName, 'X', scanner, true);
            Player machine = new Player("Ordenador", 'O', scanner, false);
            Turn turn = new Turn(player, machine);
            Game game = new Game(board, display, turn);

            display.printBoard(board.getBoard());
            game.play();
        }

}