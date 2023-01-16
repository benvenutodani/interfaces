package src.ar.com.ada.oop.compras;

public class ProductoBelleza implements Comprable{
    private String name;
    private String marca;
    private double costo; //costo

    public ProductoBelleza() {
    }

    public ProductoBelleza(String name, String marca, double costo) {
        this.name = name;
        this.marca = marca;
        this.costo = costo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "El producto; "+ name +
                ", marca: " + marca;
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
        System.out.println("El objeto " + name + "fue comprado");
    }
}
