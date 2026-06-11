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
}