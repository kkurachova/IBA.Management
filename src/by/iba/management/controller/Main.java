package by.iba.management.controller;

import by.iba.management.model.entity.*;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anastasiya", "Tuharava", false, "junior",
                "A2", new ProgrammingLanguage(true, false, false, false, false),
                new Skills(true, true, true, true, false),
                new Testing(false, false,false, false),
                new Tools(true, true, false, true));
        EmployeesRepository.getEmployeesList().add(emp1);
        Employee emp2 = new Employee("Anna", "Kuznetsova", true, "senior",
                "B2", new ProgrammingLanguage(true, false, false, false, false),
                new Skills(true, true, true, true, false),
                new Testing(false, false,false, false),
                new Tools(true, true, false, true));
        EmployeesRepository.getEmployeesList().add(emp2);
        System.out.println(emp1);

    }
}
