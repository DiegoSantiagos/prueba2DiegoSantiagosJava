package prueba2;

public class Motocicleta extends Vehiculo {

    String estilo;
    int medidaManillar;

    public Motocicleta() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precioNeto = 0;
        this.estilo = "";
        this.medidaManillar = 0;
    }

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
    public String mostrarDatos() {
        return """
                ---------Datos---------
                Patente: """ + this.patente + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio Neto: " + this.precioNeto + "\n" +
                "Estilo: " + this.estilo + "\n" +
                "Medida Manillar: " + this.medidaManillar;
    }

    @Override
    public double totalIva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double obtenerDescuento(double precioNeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
