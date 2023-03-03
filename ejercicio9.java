/*Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres,
 los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador 
 que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.*/

 import java.util.Scanner;

 public class ejercicio9 {
     public static void main(String[] args) {
         char[][] tablero = {
                 {' ', ' ', ' '},
                 {' ', ' ', ' '},
                 {' ', ' ', ' '}
         };
         boolean juegoTerminado = false;
         char jugadorActual = 'X';
         Scanner sc = new Scanner(System.in);
 
         System.out.println("¡Bienvenido al juego del Tres en Raya!");
         mostrarTablero(tablero);
 
         while (!juegoTerminado) {
             int fila, columna;
 
             System.out.print("Jugador " + jugadorActual + ", introduce la fila (1-3): ");
             fila = sc.nextInt() - 1;
             System.out.print("Jugador " + jugadorActual + ", introduce la columna (1-3): ");
             columna = sc.nextInt() - 1;
 
             if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                 System.out.println("Posición inválida. Introduce valores entre 1 y 3.");
                 continue;
             }
 
             if (tablero[fila][columna] != ' ') {
                 System.out.println("La celda ya está ocupada. Elige otra.");
                 continue;
             }
 
             tablero[fila][columna] = jugadorActual;
             mostrarTablero(tablero);
 
             if (comprobarGanador(tablero, jugadorActual)) {
                 System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                 juegoTerminado = true;
             } else if (comprobarEmpate(tablero)) {
                 System.out.println("¡Empate!");
                 juegoTerminado = true;
             }
 
             jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
         }
     }
 
     public static void mostrarTablero(char[][] tablero) {
         System.out.println("-------");
         for (int fila = 0; fila < 3; fila++) {
             System.out.print("|");
             for (int columna = 0; columna < 3; columna++) {
                 System.out.print(tablero[fila][columna] + "|");
             }
             System.out.println();
             System.out.println("-------");
         }
     }
 
     public static boolean comprobarGanador(char[][] tablero, char jugador) {
         for (int i = 0; i < 3; i++) {
             if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                 return true;
             }
             if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                 return true;
             }
         }
         if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
             return true;
         }
         if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
             return true;
         }
         return false;
     }
 
     public static boolean comprobarEmpate(char[][] tablero) {
         for (int fila = 0; fila < 3; fila++) {
             for (int columna = 0; columna < 3; columna++) {
                 if (tablero[fila][columna] == ' ') {
                     return false;
                 }
             }
         }
         return true;
     }
 }
 
 