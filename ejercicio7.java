/*Crear una tabla de caracteres bidimensional de tamaño 20×30, en la 
que se colocan caracteres elegidos al azar. Mostrar la tabla generada.*/

import java.util.Random;

public class ejercicio7 {

    public static void main(String[] args) {

        char[][] tabla = new char[20][30]; // tabla de 20 filas y 30 columnas

        // generar caracteres al azar y agregarlos a la tabla
        Random random = new Random();
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (char) (random.nextInt(26) + 'a'); // caracteres aleatorios de la a a la z
            }
        }

        // mostrar la tabla generada
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }

}







