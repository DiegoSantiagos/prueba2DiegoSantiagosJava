
package prueba2;

public abstract class Vehiculo implements IParametros {
    String patente;
    String marca;
    String modelo;
    String color;
    double precioNeto;
    double Descuento;
    double Iva;
    double precioTotal;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precioNeto = 0;
        this.Descuento = 0;
        this.Iva = 0;
        this.precioTotal = 0;
    }

    public Vehiculo(String patente, String marca, String modelo, String color, double precioNeto) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precioNeto = precioNeto;
        this.Descuento = obtenerDescuento(precioNeto);
        this.Iva = totalIva();
        this.precioTotal = precioNeto + Iva - Descuento;
    }

    public double totalIva() {
        return this.precioNeto * iva;
    }

    public double obtenerDescuento(double precioNeto) {
        if (this instanceof Automovil) {
            return precioNeto * descuento_auto;
        } else {
            return precioNeto * descuento_moto;
        }
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
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

}