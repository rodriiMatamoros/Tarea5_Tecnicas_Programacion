/*Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número
 de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al 
 registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para 
 duplicar los registros de los empleados).*/


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> empleados = new HashMap<String, String>();
        empleados.put("nombre", "Juan");
        empleados.put("numero de empleado", "1");
        empleados.put("numero de la seguridad social", "123456789");
        System.out.println("Introduce el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Introduce el numero de empleado");
        String numero = sc.nextLine();
        System.out.println("Introduce el numero de la seguridad social");
        String seguridad = sc.nextLine();
        System.out.println("El nombre del empleado es: " + empleados.get(nombre));
        System.out.println("El numero de empleado es: " + empleados.get(numero));
        System.out.println("El numero de la seguridad social es: " + empleados.get(seguridad));
    }
}