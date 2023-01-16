package src.ar.com.ada.oop;

import src.ar.com.ada.oop.subclase.Employee;

import java.util.ArrayList;
import java.util.List;

public class AppCompany {

    public static void reportEmployeeData(List<Employee> employees){

        System.out.println("Cantidad de empleados: " + employees.size());

        System.out.println( employees);
        System.out.println( employees);

    }

    public static List getFromEmployeesLessThanThirty(List<Employee> employees){
        List<Employee> employeesLessThanThirty = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            if ( employees.get(i).getEdad()<30){
                employeesLessThanThirty.add(employees.get(i));
            }
        }
        return employeesLessThanThirty;
    }




}
