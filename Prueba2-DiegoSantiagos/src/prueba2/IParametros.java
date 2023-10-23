
package prueba2;

public interface IParametros {
    double iva = 0.19;
    double descuento_auto = 0.05;
    double descuento_moto = 0.10;

    double totalIva();

    double obtenerDescuento(double precioNeto);
}
