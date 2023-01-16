package src.ar.com.ada.oop.compras;

public interface Comprable {
    String obtenerCarecterísticas();
    double definirCosto();
    double calcularPrecioFinal(double precio);
    void comprar();

}
