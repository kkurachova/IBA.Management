package by.iba.management.util;

public class EmployeeIdGenerator {
    private static long employeeId = 0;
    public static long getEmployeeId() {
        return ++employeeId;
    }
}
