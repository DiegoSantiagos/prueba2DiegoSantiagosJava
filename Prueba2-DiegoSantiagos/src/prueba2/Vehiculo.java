
package prueba2;

public abstract class Vehiculo implements IParametros {
    String patente;
    String marca;
    String modelo;
    String color;
    double precioNeto;
    double precioTotal;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precioNeto = 0;
        this.precioTotal = 0;
    }

    public Vehiculo(String patente, String marca, String modelo, String color, double precioNeto) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precioNeto = precioNeto;
        this.precioTotal = precioNeto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
        setPrecioTotal();
    }

    public double Descuento() {
        if (this instanceof Automovil) {
            double descuento = precioNeto * (100 - descuento_auto);
            return descuento;
        } else {
            double descuento = precioNeto * (100 - descuento_moto);
            return descuento;
        }
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        this.precioTotal = (precioNeto * Descuento()) + (iva * precioNeto);
    }

    public String imprimitBoleta() {
        return """
               ---------Boleta---------
               Patente: """ + this.patente + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio Neto: " + this.precioNeto + "\n" +
                "Descuento: " + Descuento() + "\n" +
                "IVA: " + (iva * precioNeto) + "\n" +
                "Precio Total: " + this.precioTotal;
    }

}