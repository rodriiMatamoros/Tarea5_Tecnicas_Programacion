/*Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). 
Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial 
para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la 
seguridad no está garantizada y un usuario puede votar varias veces...*/

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidatos = {"Emilia TERREROS", "Gerardo ESCODAR", "María AGUAVIVA", "Nadia LETUX"};
        int[] votos = new int[candidatos.length];

        while (true) {
            System.out.println("\nElija entre:");
            for (int i = 0; i < candidatos.length; i++) {
                System.out.println((i + 1) + " - " + candidatos[i]);
            }
            int voto = sc.nextInt();
            if (voto < 1 || voto > candidatos.length) {
                System.out.println("Opción inválida, intente de nuevo");
            } else {
                votos[voto - 1]++;
                System.out.println("Ha votado");
            }
            System.out.println("Presione Enter para continuar...");
            sc.nextLine(); // consume el Enter después de leer el voto

            System.out.println("\n¿Desea finalizar la votación? (Ingrese el código especial)");
            String codigo = sc.nextLine();
            if (codigo.equals("68753421")) {
                break;
            }
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < candidatos.length; i++) {
            double porcentaje = (double) votos[i] / sumarVotos(votos) * 100;
            System.out.printf("%s: %.2f %%\n", candidatos[i], porcentaje);
        }

        sc.close();
    }

    public static int sumarVotos(int[] votos) {
        int suma = 0;
        for (int voto : votos) {
            suma += voto;
        }
        return suma;
    }
}
