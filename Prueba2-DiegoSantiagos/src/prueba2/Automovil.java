package prueba2;

public class Automovil extends Vehiculo {
    int cantidadPuertas;
    int capacidadMaletero;

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
    public void imprimitBoleta() {
        System.out.println("---------Boleta---------");
        System.out.println("Patente:      " + this.patente);
        System.out.println("Marca:        " + this.marca);
        System.out.println("Modelo:       " + this.modelo);
        System.out.println("Color:        " + this.color);
        System.out.println("Precio Neto:  " + this.precioNeto);
        System.out.println("Descuento:    " + this.Descuento);
        System.out.println("IVA:          " + this.Iva);
        System.out.println("Precio Total: " + this.precioTotal);
    }
}
