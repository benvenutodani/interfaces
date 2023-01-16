package src.ar.com.ada.oop.subclase;

import java.util.Objects;

public class Customer {
     private int registerCode;
     private String razonSocial;
     private String direccion;

    public Customer() {
    }
    public Customer(int registerCode, String razonSocial, String direccion) {
        this.registerCode = registerCode;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    public int getRegisterCode() {
        return registerCode;
    }
    public void setRegisterCode(int registerCode) {
        this.registerCode = registerCode;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "registerCode=" + registerCode +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return registerCode == customer.registerCode && Objects.equals(razonSocial, customer.razonSocial) && Objects.equals(direccion, customer.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerCode, razonSocial, direccion);
    }


}
