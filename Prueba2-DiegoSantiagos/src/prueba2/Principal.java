
package prueba2;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        String marca = "Yamaha";
        String modelo = "YZF-R1";
        String color = "Azul";
        double precioNeto = 15000.0;
        String estilo = "Deportiva";
        int medidaManillar = 800;

        Motocicleta moto = new Motocicleta(patente, marca, modelo, color, precioNeto, estilo, medidaManillar);
        vehiculos.add(moto);
        int opcion = 0;
        Scanner leerTeclado = new Scanner(System.in);
        while (opcion != 6) {

            System.out.println("______MENU______");
            System.out.println("1. Ingresar Automovil");
            System.out.println("2. Mostrar total a pagar por patente");
            System.out.println("3. Listar todos los vehiculos");
            System.out.println("4. Eliminar vehiculo por patente");
            System.out.println("5. mostrar total de vehiculos por tipo de vehiculo");
            System.out.println("6. Salir");
            System.out.println("--------------------");
            System.out.println("Ingrese una opcion: ");
            opcion = leerTeclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de vehiculo: \n1 para Automovil \n2 para Motocicleta): ");
                    int tipo = leerTeclado.nextInt();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo de vehiculo no valido");
                        break;
                    }
                    System.out.println("Ingrese la patente del vehiculo: ");
                    String patente = leerTeclado.next();
                    if (patente.isEmpty()) {
                        System.out.println("La patente no puede estar vacia. No se creo el vehiculo");
                        break;
                    } else if (patente.length() != 6) {
                        System.out.println("La patente debe tener 6 caracteres. No se creo el vehiculo");
                        break;
                    }
                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marca = leerTeclado.next();
                    System.out.println("Ingrese el modelo del vehiculo: ");
                    String modelo = leerTeclado.next();
                    System.out.println("Ingrese el color del vehiculo: ");
                    String color = leerTeclado.next();
                    System.out.println("Ingrese el precio neto del vehiculo: ");
                    double precioNeto = leerTeclado.nextDouble();

                    if (tipo == 1) {
                        // Crear un nuevo objeto Automovil
                        System.out.println("Ingrese la cantidad de puertas del automovil: ");
                        int cantidadPuertas = leerTeclado.nextInt();
                        System.out.println("Ingrese la capacidad del maletero del automovil (en litros): ");
                        int capacidadMaletero = leerTeclado.nextInt();

                        Automovil automovil = new Automovil(patente, marca, modelo, color, precioNeto, cantidadPuertas,
                                capacidadMaletero);

                        // Agregar el automovil al taller
                        agregarVehiculo(automovil);
                    } else if (tipo == 2) {
                        // Crear un nuevo objeto Motocicleta
                        System.out.println("Ingrese el estilo de la motocicleta (deportiva, cross, etc.): ");
                        String estilo = leerTeclado.next();
                        System.out.println("Ingrese la medida del manillar de la motocicleta: ");
                        int medidaManillar = leerTeclado.nextInt();

                        Motocicleta motocicleta = new Motocicleta(patente, marca, modelo, color, precioNeto, estilo,
                                medidaManillar);

                        // Agregar la motocicleta al taller
                        TallerMecanico.agregarVehiculo(motocicleta);
                    }

                    break;
                case 2:
                    // mostrarTotalAPagarPorPatente();
                    break;
                case 3:
                    // TallerMecanico.contarVehiculos();
                case 4:

                    TallerMecanico.eliminarVehiculo();
                    break;
                case 5:
                    // mostrarTotalDeVehiculosPorTipoDeVehiculo();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
        leerTeclado.close();
    }
}
