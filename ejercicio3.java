//Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[100];
        int cantidadNotas = 0;
        int sumaNotas = 0;

        while (true) {
            System.out.print("¿Nota? ");
            int nota = sc.nextInt();

            if (nota < 0) {
                break;
            }

            notas[cantidadNotas] = nota;
            cantidadNotas++;
            sumaNotas += nota;
        }

        System.out.print("Las notas son: ");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print(notas[i] + "; ");
        }

        double mediaNotas = (double) sumaNotas / cantidadNotas;
        System.out.print("\nLa media de las notas es " + mediaNotas);

        sc.close();
    }
}
