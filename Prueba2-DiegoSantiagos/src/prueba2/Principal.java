
package prueba2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // make a motorbike
        Motocicleta moto1 = new Motocicleta("ABC123", "Yamaha", "YBR", "Rojo", 1000000, "Deportiva", 30);
        TallerMecanico.anadirmoto(moto1);

        int opcion = 0;

        while (opcion != 6) {
            Scanner leerTeclado = new Scanner(System.in);
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
                    TallerMecanico.agregarVehiculo();
                    break;
                case 2:
                    TallerMecanico.mostrarTotalAPagarPorPatente();
                    break;
                case 3: {
                    TallerMecanico.ListarVehiculos();
                    break;
                }
                case 4: {
                    System.out.println("Ingrese la patente del vehiculo: ");
                    String patente_Eliminar = leerTeclado.next();
                    TallerMecanico.eliminarVehiculo(patente_Eliminar);
                    break;
                }
                case 5:
                    TallerMecanico.mostrarVehiculosPorTipo();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
