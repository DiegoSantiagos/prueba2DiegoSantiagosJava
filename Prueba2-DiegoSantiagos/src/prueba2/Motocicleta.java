package prueba2;

public class Motocicleta extends Vehiculo {

    String estilo;
    int medidaManillar;

    public Motocicleta(String patente, String marca, String modelo, String color, double precioNeto,
            String estilo, int medidaManillar) {
        super(patente, marca, modelo, color, precioNeto);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
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
