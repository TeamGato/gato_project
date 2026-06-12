package tictactoe;
import java.util.Scanner;

/**
 * Handles user input from the console.
 * Currently responsible for collecting the player's name.
 */

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String playerName() {
        System.out.println("Introduce tu nombre: ");
        String name = scanner.nextLine();
        return name;
    }
  
    public String menuRestart() {
        System.out.println("\n=========================");
        System.out.println("    1. Volver a Jugar");
        System.out.println("    2. Salir");
        System.out.println("=========================");
        System.out.print("Elige una opción: ");

        String option = scanner.nextLine();
        return option;
    }
}