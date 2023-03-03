/*Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones: 
Solo hay un jugador. Solo hay cuatro filas y cuatro columnas. Solo hay un barco que ocupa 
una única celda (este espacio se elige al azar).*/


import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        char[][] tablero = new char[4][4];
        int barcoFila = (int) (Math.random() * 4);
        int barcoColumna = (int) (Math.random() * 4);
        boolean barcoHundido = false;
        Scanner entrada = new Scanner(System.in);

        // inicializar el tablero con espacios en blanco
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = ' ';
            }
        }

        // jugar hasta hundir el barco
        while (!barcoHundido) {
            // mostrar el tablero actual
            System.out.println("Tablero actual:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // pedir al usuario la posición del disparo
            System.out.print("¿Qué columna? ");
            int columna = entrada.nextInt() - 1; // se resta uno para ajustar a la matriz
            System.out.print("¿Qué fila? ");
            int fila = entrada.nextInt() - 1; // se resta uno para ajustar a la matriz

            // verificar si el disparo acertó el barco
            if (fila == barcoFila && columna == barcoColumna) {
                System.out.println("Tocado y hundido");
                tablero[fila][columna] = 'X';
                barcoHundido = true;
            } else {
                System.out.println("Agua");
                tablero[fila][columna] = '~';
            }
        }

        // mostrar el tablero final
        System.out.println("Tablero final:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("¡Ha ganado!");
    }

}
