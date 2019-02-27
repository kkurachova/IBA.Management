package by.iba.management.model.entity;

import java.util.ArrayList;

public class EmployeesRepository {
    private static ArrayList<Employee> employeesList = new ArrayList<Employee>();

    private EmployeesRepository() {
    }

    public static ArrayList<Employee> getEmployeesList () {
        ArrayList<Employee> temp = employeesList;
        return temp;
    }

}
