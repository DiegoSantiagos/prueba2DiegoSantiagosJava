
package prueba2;

import java.util.ArrayList;
import java.util.Scanner;

public class TallerMecanico {

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void anadirmoto(Vehiculo moto) {
        vehiculos.add(moto);
    }

    public static void anadirauto(Vehiculo auto) {

        vehiculos.add(auto);
    }

    public static void agregarVehiculo() {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo: \n1 para Automovil \n2 para Motocicleta ");
        int tipo = leerTeclado.nextInt();
        leerTeclado.nextLine();

        if (tipo != 1 && tipo != 2) {
            System.out.println("Tipo de vehiculo no valido");
            return;
        }

        System.out.println("Ingrese la patente del vehiculo: ");
        String patente = leerTeclado.next();

        if (patente.isEmpty()) {
            System.out.println("La patente no puede estar vacia. No se creo el vehiculo");
            return;

        } else if (patente.length() != 6) {
            System.out.println("La patente debe tener 6 caracteres. No se creo el vehiculo");
            return;
        } else if (vehiculos.stream().anyMatch(v -> v.getPatente().equals(patente))) {
            System.out.println("La patente ya existe, no se puede agregar");
            return;
        }
        leerTeclado.nextLine();
        System.out.println("Ingrese la marca del vehiculo: ");
        String marca = leerTeclado.next();
        leerTeclado.nextLine();
        System.out.println("Ingrese el modelo del vehiculo: ");
        String modelo = leerTeclado.next();
        leerTeclado.nextLine();
        System.out.println("Ingrese el color del vehiculo: ");
        String color = leerTeclado.next();
        leerTeclado.nextLine();
        System.out.println("Ingrese el precio neto del vehiculo: ");
        double precioNeto = leerTeclado.nextDouble();
        leerTeclado.nextLine();
        if (tipo == 1) {
            // Crear un nuevo objeto Automovil
            System.out.println("Ingrese la cantidad de puertas del automovil: ");
            int cantidadPuertas = leerTeclado.nextInt();
            leerTeclado.nextLine();
            System.out.println("Ingrese la capacidad del maletero del automovil (en litros): ");
            int capacidadMaletero = leerTeclado.nextInt();

            Automovil automovil = new Automovil(patente, marca, modelo, color, precioNeto, cantidadPuertas,
                    capacidadMaletero);

            // Agregar el automovil al taller
            System.out.println("El automovil se agrego correctamente");
            vehiculos.add(automovil);

        } else if (tipo == 2) {
            // Crear un nuevo objeto Motocicleta
            System.out.println("Ingrese el estilo de la motocicleta (deportiva, cross, etc.): ");
            String estilo = leerTeclado.next();
            leerTeclado.nextLine();
            System.out.println("Ingrese la medida del manillar de la motocicleta: ");
            int medidaManillar = leerTeclado.nextInt();

            Motocicleta motocicleta = new Motocicleta(patente, marca, modelo, color, precioNeto, estilo,
                    medidaManillar);

            System.out.println("La motocicleta se agrego correctamente");
            // Agregar la motocicleta al taller
            vehiculos.add(motocicleta);
        }
    }

    public static void verificarPatente(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(patente)) {
                System.out.println("La patente ya existe, no se puede agregar");
                return;
            }
        }
    }

    public static void mostrarTotalAPagarPorPatente() {
        Scanner leerTeclado3 = new Scanner(System.in);
        System.out.println("Ingrese la patente del vehiculo: ");
        String patente = leerTeclado3.next();
        if (patente.isEmpty()) {
            System.out.println("La patente no puede estar vacia. No se creo el vehiculo");
            return;
        } else if (patente.length() != 6) {
            System.out.println("La patente debe tener 6 caracteres. No se creo el vehiculo");
            return;
        }
        boolean encontrado = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                encontrado = true;
                System.out.println("El total a pagar es de: " + vehiculo.precioTotal);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Patente no encontrada");
        }
    }

    public static void ListarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.imprimitBoleta());
        }
    }

    public static void eliminarVehiculo(String patente_Eliminar) {

        if (patente_Eliminar.isEmpty()) {
            System.out.println("No se puede eliminar un vehiculo sin patente");
            return;
        } else if (patente_Eliminar.length() != 6) {
            System.out.println("Patente no valida");
            return;
            // make a check if the patente is in a Vehiculo
        } else if (!vehiculos.stream().anyMatch(v -> v.getPatente().equals(patente_Eliminar))) {
            System.out.println("Patente no encontrada");
            return;
        } else {
            boolean eliminado = false;
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getPatente().equals(patente_Eliminar)) {
                    vehiculos.remove(vehiculo);
                    eliminado = true;
                    System.out.println("Vehiculo eliminado");
                    break;
                }
            }
            if (!eliminado) {
                System.out.println("Patente no encontrada");
            }
        }
    }

    public static void mostrarVehiculosPorTipo() {
        int totalAutomoviles = 0;
        int totalMotocicletas = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Automovil) {
                totalAutomoviles++;
            } else {
                totalMotocicletas++;
            }
        }
        System.out.println("El total de automoviles es de: " + totalAutomoviles);
        System.out.println("El total de motocicletas es de: " + totalMotocicletas);
    }
}
