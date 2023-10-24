
package prueba2;

public abstract class Vehiculo implements IParametros {
    String patente;
    String marca;
    String modelo;
    String color;
    double precioNeto;
    double precioTotal;
    double valorDescuento;
    double ivaPagar;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precioNeto = 0;
        this.precioTotal = 0;
        this.valorDescuento = 0;
        this.ivaPagar = 0;
    }

    public Vehiculo(String patente, String marca, String modelo, String color, double precioNeto) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        setPrecioNeto(precioNeto);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {

        if (patente.length() != 6) {
            System.out.println("La patente debe tener 6 caracteres");
        } else if (patente.isEmpty()) {
            System.out.println("La patente no puede estar vacia");
        } else if (vehiculos.stream().anyMatch(v -> v.getPatente().equals(patente))) {
            System.out.println("La patente ya existe");
        } else
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
        setValorDescuento();
        setIvaPagar();
        setPrecioTotal();
    }

    public double getValorDescuento() {
        return valorDescuento;

    }

    public void setValorDescuento() {
        if (this instanceof Automovil) {
            this.valorDescuento = precioNeto * descuento_auto;
        } else {
            this.valorDescuento = precioNeto * descuento_moto;
        }
    }

    public double getIvaPagar() {
        return ivaPagar;
    }

    public void setIvaPagar() {
        this.ivaPagar = iva * precioNeto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        this.precioTotal = precioNeto - valorDescuento + ivaPagar;
    }

    public String imprimitBoleta() {
        return """
                ---------Boleta---------
                Patente: """ + this.patente + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio Neto: " + this.precioNeto + "\n" +
                "Descuento: " + this.valorDescuento + "\n" +
                "IVA: " + this.ivaPagar + "\n" +
                "Precio Total: " + this.precioTotal;
    }

    public String mostrarDatos() {
        return """
                ---------Datos---------
                Patente: """ + this.patente + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio Neto: " + this.precioNeto;
    }
}