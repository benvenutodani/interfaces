package src.ar.com.ada.oop.subclase;

import java.util.Objects;

public class Employee {
    private String name;
    private String dni;
    private int edad;

    public Employee() {
    }
    public Employee(String name, String dni, int edad) {
        this.name = name;
        this.dni = dni;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(dni, employee.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dni, edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", dni: " + dni +", edad: " + edad;
    }
}
