package src.ar.com.ada.oop.distribuidora;

import java.util.Objects;

public class Repuesto extends Articulo implements Deposito {
    private String material;
    private int ventaPorAnio;

    public Repuesto() {
    }

    public Repuesto(String originalCode, String code, String description, String proveedor, String material, int cant) {
        super(originalCode, code, description, proveedor, cant);
        this.material = material;
    }

    public int getVentaPorAnio() {
        return ventaPorAnio;
    }

    public void setVentaPorAnio(int ventaPorAnio) {
        this.ventaPorAnio = ventaPorAnio;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        String var10000 = this.getOriginalCode();
        return "Repuesto:  Codigo Original: " + var10000 + " Codigo: " + this.getCode() + " Descripción: " + this.getDescription() + " Proveedor: " + this.getproved() + " Material: " + this.material;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Repuesto repuesto = (Repuesto)o;
            return this.getOriginalCode().equals(repuesto.getOriginalCode());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.material});
    }

    @Override
    public void guardarEnDeposito() {
        if (material == "chapa"){
            System.out.println("Las Consultas de stock se deben hacer al:" + CONSULTATRES);
        }else if (ventaPorAnio>100){
            System.out.println("Las consultas de stock se deben hacer al:" + CONSULTAUNO);
        }
        System.out.println( "Las consultas de stock de deben hacer al: " + CONSULTADOS);
    }

    @Override
    public void  consultarStock(){

        if (material == "chapa"){
        System.out.println("Se debe guardar en el " + DEPOSITOC);
        }else if (ventaPorAnio>100){
            System.out.println("Se debe guardar en el " + DEPOSITOB);
        }
        System.out.println( "se debe guardar en el " + DEPOSITOA);
    }
}