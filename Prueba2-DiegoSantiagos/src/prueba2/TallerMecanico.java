
package prueba2;

import java.util.ArrayList;
import java.util.Scanner;

public class TallerMecanico {

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void agregarVehiculo(Vehiculo vehiculo) {
        // verificar si la patente ya existe
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(vehiculo.getPatente())) {
                System.out.println("La patente ya existe, no se puede agregar");
                return;
            }
        }
        vehiculos.add(vehiculo);
        return;
    }

    public static void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void eliminarVehiculo() {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Ingrese la patente del vehiculo: ");
        String patente_Eliminar = leerTeclado.next();
        if (patente_Eliminar.isEmpty()) {
            System.out.println("No se puede eliminar un vehiculo sin patente");
            return;
        } else if (patente_Eliminar.length() != 6) {
            System.out.println("Patente no valida");
            return;
            // make a check if the patente is in a Vehiculo
        } else if (patente_Eliminar != vehiculos.getPatente()) {
            System.out.println("Patente no encontrada");
            return;
        } else {
            boolean eliminado = Vehiculos.remove(patente);
            if (eliminado) {
                System.out.println("Vehiculo eliminado");
            } else {
                System.out.println("Vehiculo no encontrado");
            }
        }
        leerTeclado.close();
    }

    public static void contarVehiculos() {
        int totalVehiculos = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalVehiculos++;
        }
        System.out.println("El total de vehiculos en el taller es de: " + totalVehiculos);
    }
}
