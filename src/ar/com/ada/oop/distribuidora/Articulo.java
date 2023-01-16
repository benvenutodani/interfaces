package src.ar.com.ada.oop.distribuidora;

public class Articulo {
    private String originalCode;
    private String code;
    private String description;
    private String proveedor;
    private int cant;
    private int ventaPorAnio;

    public Articulo() {
    }

    public Articulo(String originalCode, String code, String description, String proveedor, int cant) {
        this.originalCode = originalCode;
        this.code = code;
        this.description = description;
        this.proveedor = proveedor;
        this.cant = cant;
    }

    public String getOriginalCode() {
        return this.originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getproved() {
        return this.proveedor;
    }

    public void setProved(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCant() {
        return this.cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}