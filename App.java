import src.ar.com.ada.oop.Animal;
import src.ar.com.ada.oop.AppCompany;
import src.ar.com.ada.oop.Person;
import src.ar.com.ada.oop.compras.*;
import src.ar.com.ada.oop.distribuidora.Bateria;
import src.ar.com.ada.oop.distribuidora.Repuesto;
import src.ar.com.ada.oop.distribuidora.Deposito;
import src.ar.com.ada.oop.interfaces.LivingBeing;
import src.ar.com.ada.oop.subclase.Customer;
import src.ar.com.ada.oop.subclase.Employee;

import java.util.*;

public class App {
    public static void main(String[] args){
      /*  List<LivingBeing> livingBeing = new ArrayList<>();
        livingBeing.add(new Person());
        livingBeing.add(new Animal());

        for (int i = 0; i < livingBeing.size(); i++) {
            livingBeing.get(i).eat("Pan");
            livingBeing.get(i).sleep();
            livingBeing.get(i).communicate();

        }

        List<Deposito> articulos = new ArrayList<>();
        articulos.add(new Repuesto("1234", "1234a", "soporte", "accesorios","plastico", 200));
        articulos.add(new Bateria("1235", "2222", "bateria45", "acdelco", (byte) 2, 45,200));

        for (int i = 0; i < articulos.size(); i++) {
            articulos.get(i).toString();
            articulos.get(i).consultarStock();
            articulos.get(i).guardarEnDeposito();
        }*/
      /*  List<Comprable> listaCompra = new ArrayList<>();
        listaCompra.add(new Auto((byte) 4, 120, "Rojo",100000 ,"nafta"));
        listaCompra.add(new Bicicleta((byte) 2, 30, "verde", 20000, "playera"));
        listaCompra.add(new Alimento("Sopa", new Date(), 200));
        listaCompra.add(new ProductoBelleza("crema de manos", "nivea", 590));


        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i).obtenerCarecterísticas());
            System.out.println(listaCompra.get(i).definirCosto());
            System.out.println(listaCompra.get(i).calcularPrecioFinal(250));
            listaCompra.get(i).comprar();
            System.out.println("\n");

        }

       */

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Daniela", "3233333", 32));
        employees.add(new Employee("Melina", "3233322", 22));
        employees.add(new Employee("Mariana", "3333333", 24));
        employees.add(new Employee("Belen", "3233233", 25));
        employees.add(new Employee("Juan", "32333433", 32));
        employees.add(new Employee("Daniel", "3233333", 31));

        AppCompany.reportEmployeeData(employees);
        System.out.println("Los empleados menores de treinta son: "+ AppCompany.getFromEmployeesLessThanThirty(employees));

        HashSet<Customer> customers = new HashSet<>();

        customers.add(new Customer(1234, "Poleman", "La plata 1234"));
        customers.add(new Customer(1235, "Gatti", "Asuncion 1234"));
        customers.add(new Customer(1236, "Farola", "Beiro 1234"));
        customers.add(new Customer(1237, "Casa Fiat", "Lope de Vega 1234"));
        customers.add(new Customer(1233, "Goma", "Quevedo 1234"));




    }



}
