package tictactoe;
import java.util.Scanner;

// metodo de entrada: crear nombre jugador  y iniciar partida y salir del juego
// metodo salida: iniciar partida y salir del juego
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
