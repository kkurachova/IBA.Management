package by.iba.management.util;

import by.iba.management.model.entity.EmployeesRepository;

public class EmployeeIdGenerator {
    private static long employeeId = EmployeesRepository.getEmployeesList().size();
    public static long getEmployeeId() {
        return ++employeeId;
    }
}