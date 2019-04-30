package by.iba.management.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by katya on 4/26/2019.
 */

public class DataReader {
    private static String FILE_PATH = "D:/IBA/Java/javaProjects/IBA.Management/data/EmployeesList.xlsx";
    private static ArrayList<String> employeeList = new ArrayList<>();
    public static ArrayList<String> readFile() {
        File file = new File(FILE_PATH);
        try (FileInputStream fis = new FileInputStream(file)){
            XSSFWorkbook employeesListXSSF = new XSSFWorkbook(fis);
            XSSFSheet mySheet = employeesListXSSF.getSheetAt(0);
            for (Row row : mySheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                }
            }
        } catch (IOException fe) {
            fe.printStackTrace();
        }
        return employeeList;
    }
}



