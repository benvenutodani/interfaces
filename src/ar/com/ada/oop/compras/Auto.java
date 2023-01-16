package src.ar.com.ada.oop.compras;

public class Auto extends Rodado  {

    private String tipoCombustible;

    public Auto() {
    }

    public Auto(byte numeroRuedas, double velocidadMaxima, String color, double costo, String tipoCombustible) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "El auto: " +
                " Tipo de combustible: " + tipoCombustible +
                ", El número de ruedas: " + numeroRuedas +
                ", La velocidad máxima: " + velocidadMaxima +
                ", El color: " + color ;
    }

    @Override
    public String obtenerCarecterísticas() {
        return toString();
    }

    @Override
    public void comprar() {
        System.out.println("El auto fue comprado");
    }
}
