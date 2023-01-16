package src.ar.com.ada.oop.compras;

public class Bicicleta extends Rodado{

    private String tipo;
    public Bicicleta(){}

    public Bicicleta(byte numeroRuedas, double velocidadMaxima, String color, double costo, String tipo) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta: " +
                ", El tipo: " + tipo + '\'' +
                ", El número de Ruedas: " + numeroRuedas +
                ", La velocidad máxima: " + velocidadMaxima +
                ", El color: " + color ;
    }

    @Override
    public String obtenerCarecterísticas() {
        return super.obtenerCarecterísticas() + " tipo de bici:" + tipo;
    }

    @Override
    public void comprar() {
        System.out.println("La bicicleta fue comprada");;
    }
}
