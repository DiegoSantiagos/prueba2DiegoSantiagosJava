package prueba2;

public class Automovil extends Vehiculo {

    int cantidadPuertas;
    int capacidadMaletero;

    public Automovil() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precioNeto = 0;
        this.cantidadPuertas = 0;
        this.capacidadMaletero = 0;
    }

    public Automovil(String patente, String marca, String modelo, String color, double precioNeto, int cantidadPuertas,
            int capacidadMaletero) {
        super(patente, marca, modelo, color, precioNeto);
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String imprimitBoleta() {
        return "---------Boleta---------\n" +
                "Patente: " + this.patente + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio Neto: " + this.precioNeto + "\n" +
                "Descuento: " + descuento_auto + "\n" +
                "IVA: " + (iva * precioNeto) + "\n" +
                "Precio Total: " + this.precioTotal;
    }

    @Override
    public double totalIva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double obtenerDescuento(double precioNeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
