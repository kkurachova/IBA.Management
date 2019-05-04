package by.iba.management.model.entity;

import by.iba.management.model.exception.ReadEmployeesList_IOException;
import by.iba.management.util.DataParser;
import by.iba.management.util.DataReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

public class EmployeesRepository {
    private static ArrayList<Employee> employeesList = new ArrayList<>();
    private static final Logger logger = LogManager.getRootLogger();
    private EmployeesRepository() {
    }

    public static ArrayList<Employee> getEmployeesList() {
        try {
            employeesList = DataParser.parseStringToCreateEmployee(DataReader.readFile());
        } catch (IOException e) {
            logger.error("Error reading file: ", e);
        }
        return employeesList;
    }
}
