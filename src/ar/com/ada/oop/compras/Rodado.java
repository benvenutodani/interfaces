package src.ar.com.ada.oop.compras;

public class Rodado implements Comprable{
   protected byte numeroRuedas;
   protected double velocidadMaxima;
   protected String color;
   protected double costo;
    public Rodado() {
    }

    public Rodado(byte numeroRuedas, double velocidadMaxima, String color, double costo) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.costo = costo;
    }

    public byte getNumeroRuedas() {
        return numeroRuedas;
    }
    public void setNumeroRuedas(byte numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rodado:" +
                "numero de ruedas: " + numeroRuedas +
                ", velocidad máxima: " + velocidadMaxima +
                ", color: " + color ;
    }


    @Override
    public String obtenerCarecterísticas() {
        return toString();
    }

    @Override
    public double definirCosto() {
        return costo;
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        return precio * costo;
    }

    @Override
    public void comprar() {
        System.out.println("El Rodado fue comprado");
    }
}
