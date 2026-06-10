package tictactoe;
import java.util.Scanner;

// persona (player 1)
// maquina (player 2)
public class Player {
    private String name;
    private char symbol;
    private Scanner scanner;

public Player(String name, char symbol, Scanner scanner) {
    this.name = name;
    this.symbol = symbol;
    this.scanner = scanner;
}

public int translateRow(char row) {
    switch (row) {
        case 'A': return 0;
        case 'B': return 1;
        case 'C': return 2;
        default: return -1;
    }
}
public int translateCol(char col) {
    switch (col) {
        case '1': return 0;
        case '2': return 1;
        case '3': return 2;
        default: return -1;
    }
}

public void makeMove(Board board) {
    System.out.println("Introduce la fila (A-C): ");
    char row = scanner.nextLine().toUpperCase().charAt(0);

    System.out.println("Introduce la columna (1-3): ");
    char col = scanner.nextLine().charAt(0);

    int translatedRow = translateRow(row);
    int translatedCol = translateCol(col);

    if (translatedRow == -1 || translatedCol == -1) {
        System.out.println("¡Movimiento inválido! Usa filas A-C y columnas 1-3.");
        makeMove(board);
    } else if (board.isCellAvailable(translatedRow, translatedCol)) {
        board.updateBoard(translatedRow, translatedCol, symbol);
    } else {
        System.out.println("¡Celda ocupada! Elige otra posición.");
        makeMove(board);
    }
}

public String getName() {
    return name;
}

public char getSymbol() {
    return symbol;
}
}