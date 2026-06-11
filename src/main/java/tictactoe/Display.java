package tictactoe;

// Welcome (reglas)
// Mostrar el tablero
// impresión resumen
// Llamar menu salida

public class Display{
    public void welcome() {

        System.out.println("=========================================" );
        System.out.println("    🎮 BIENVENIDOS A TIC TAC TOE 🎮    " );
        System.out.println("=========================================");
        System.out.println("Reglas del juego:");
        System.out.println("1. El juego se desarrolla en una cuadrícula de 3x3.");
        System.out.println("2. El Jugador 1 usará la 'X' y el ordenador 2 la 'O'.");
        System.out.println("3. La 'X' siempre empezará la partida");
        System.out.println("4. Los jugadores se turnan para colocar su ficha.");
        System.out.println("5. Gana el primero en conseguir 3 fichas en línea (vertical, horizontal o diagonal).");
        System.out.println("6. Si el tablero se llena y no hay línea, es EMPATE.\n");
        System.out.println("          ¡BUENA SUERTE!\uD83D\uDE3C");
        System.out.println("=========================================\n");
    }


    public void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("  -------------");
        System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("  -------------");
        System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("  -------------");
        System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("  -------------");
        }
    }


