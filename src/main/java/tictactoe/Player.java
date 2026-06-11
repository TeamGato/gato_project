package tictactoe;
import java.util.Scanner;
import java.util.Random;

// persona (player 1)
// ordenador (player 2)

public class Player {
    private String name;
    private char symbol;
    private Scanner scanner;
    private boolean isHuman;

public Player(String name, char symbol, Scanner scanner, boolean isHuman) {
    this.name = name;
    this.symbol = symbol;
    this.scanner = scanner;
    this.isHuman = isHuman;
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

public void humanMove(Board board) {
    System.out.println("Introduce la fila (A-C): ");
    char row = scanner.nextLine().toUpperCase().charAt(0);

    System.out.println("Introduce la columna (1-3): ");
    char col = scanner.nextLine().charAt(0);

    int translatedRow = translateRow(row);
    int translatedCol = translateCol(col);

    if (translatedRow == -1 || translatedCol == -1) {
        System.out.println("¡Movimiento inválido! Usa filas A-C y columnas 1-3.");
        humanMove(board);
    } else if (board.isCellAvailable(translatedRow, translatedCol)) {
        board.updateBoard(translatedRow, translatedCol, symbol);
    } else {
        System.out.println("¡Celda ocupada! Elige otra posición.");
        humanMove(board);
    }
}

public void machineMove (Board board) {
    Random random = new Random();
    int row, col;

    do {
        row = random.nextInt(3);
        col = random.nextInt(3);
    } while (!board.isCellAvailable(row, col));

    board.updateBoard(row, col, symbol);
    System.out.println("El ordenador jugó en la fila " + row + " columna " + col);
}

public void move(Board board) {
    if (isHuman) {
        humanMove(board);
    } else {
        machineMove(board);
    }
}

public String getName() {
    return name;
}

public char getSymbol() {
    return symbol;
}
}