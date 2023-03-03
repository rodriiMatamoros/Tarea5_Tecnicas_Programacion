/*Un palíndromo es una palabra cuyo orden de letras sigue siendo el mismo si se lee de izquierda a derecha 
o de derecha a izquierda. Ejemplos: Kayak, Ana, radar, rotor, etc. Escriba un algoritmo que pida al usuario 
una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final 
(# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo. */

import java.util.Scanner;

public class ejercico5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba una palabra y después #:");
        String palabra = input.next();
        String reverso = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(reverso)) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }
}
