/*Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,
número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita 
acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria 
suficiente para duplicar los registros de los empleados).
 */


import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
    private HashMap<String, Empleado> hashNombre;
    private HashMap<Integer, Empleado> hashNumEmpleado;
    private HashMap<Integer, Empleado> hashNumSegSocial;

    public Ejercicio10() {
        hashNombre = new HashMap<String, Empleado>();
        hashNumEmpleado = new HashMap<Integer, Empleado>();
        hashNumSegSocial = new HashMap<Integer, Empleado>();
    }

    public void agregarEmpleado(Empleado empleado) {
        hashNombre.put(empleado.getNombre(), empleado);
        hashNumEmpleado.put(empleado.getNumEmpleado(), empleado);
        hashNumSegSocial.put(empleado.getNumSegSocial(), empleado);
    }

    public Empleado buscarPorNombre(String nombre) {
        return hashNombre.get(nombre);
    }

    public Empleado buscarPorNumEmpleado(int numEmpleado) {
        return hashNumEmpleado.get(numEmpleado);
    }

    public Empleado buscarPorNumSegSocial(int numSegSocial) {
        return hashNumSegSocial.get(numSegSocial);
    }

    public static void main(String[] args) {
        Ejercicio10 ej = new Ejercicio10();

        // Agregar algunos empleados
        Empleado emp1 = new Empleado("Juan Perez", 1001, 123456789);
        Empleado emp2 = new Empleado("Maria Rodriguez", 1002, 234567890);
        Empleado emp3 = new Empleado("Pedro Gomez", 1003, 345678901);

        ej.agregarEmpleado(emp1);
        ej.agregarEmpleado(emp2);
        ej.agregarEmpleado(emp3);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Buscar empleado");
            System.out.println("2. Agregar empleado");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después del número

            if (opcion == 3) {
                break;
            }

            if (opcion == 1) {
                System.out.println("Ingrese una opción de búsqueda:");
                System.out.println("1. Buscar por nombre");
                System.out.println("2. Buscar por número de empleado");
                System.out.println("3. Buscar por número de seguridad social");

                int opcionBusqueda = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea después del número

                Empleado emp = null;

                if (opcionBusqueda == 1) {
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = sc.nextLine();
                    emp = ej.buscarPorNombre(nombre);
                } else if (opcionBusqueda == 2) {
                    System.out.println("Ingrese el número de empleado:");
                    int numEmpleado = sc.nextInt();
                    emp = ej.buscarPorNumEmpleado(numEmpleado);
                } else if (opcionBusqueda == 3) {
                    System.out.println("Ingrese el número de seguridad social:");
                    int numSegSocial = sc.nextInt();
                    emp = ej.buscarPorNumSegSocial(numSegSocial);
                }

                if (emp != null) {
                    System.out.println("Empleado encontrado:");
                    System.out.println("Nombre: " + emp.getNombre());
                    System.out.println("Número de empleado: " + emp.getNumEmpleado());
                    System.out.println("Número de seguridad social: " + emp.getNumSegSocial());
                } else {
                    System.out.println("Empleado no encontrado");
                }
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del empleado:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el número de empleado:");
                int numEmpleado = sc.nextInt();
                System.out.println("Ingrese el número de seguridad social:");
                int numSegSocial = sc.nextInt();

                Empleado emp = new Empleado(nombre, numEmpleado, numSegSocial);
                ej.agregarEmpleado(emp);

                System.out.println("Empleado agregado");

            } else {
                System.out.println("Opción inválida");

            }
        }
    }
}
