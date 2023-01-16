package src.ar.com.ada.oop.compras;

import java.util.Date;

public class Alimento implements Comprable{
    private String name;
    private Date fechaVencimiento;
    private double costo; // fecha antes de  la fecha es igual al costo. costo si fecha de vencimiento esta dentro de los cinco dias siguientes se le descontara el 20%

    public Alimento(String sopa, Date fechaVencimiento, int costo) {
    }

    public Alimento(String name, Date fechaVencimiento, double costo) {
        this.name = name;
        this.fechaVencimiento = fechaVencimiento;
        this.costo = costo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return  "El alimento: " + name  +
                ", fecha de vencimiento: " + fechaVencimiento;
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
        return costo* precio;
    }

    @Override
    public void comprar() {
        System.out.println("El alimento "+name+ " fue comprado" );
    }
}
