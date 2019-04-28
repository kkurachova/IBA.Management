package by.iba.management.model.entity;

import java.util.ArrayList;

public class EmployeesRepository {
    private static ArrayList<Employee> employeesList = new ArrayList<>();

    private EmployeesRepository() {
    }

    public static ArrayList<Employee> getEmployeesList () {
        return employeesList;
    }
    }
