package by.iba.management.util;

import by.iba.management.model.exception.ReadEmployeesList_IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by katya on 4/26/2019.
 */

public class DataReader {
    private static String FILE_PATH = "data/EmployeesList.xlsx";
    private static final Logger logger = LogManager.getRootLogger();
    private static ArrayList<String> employeeList = new ArrayList<>();
    public static ArrayList<String> readFile() throws IOException {
        File file = new File(FILE_PATH);
        try (FileInputStream fis = new FileInputStream(file)) {
            // Using XSSF for xlsx format, for xls use HSSF
            Workbook workbook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = (XSSFSheet) workbook.getSheetAt(0);
            //TO DO: go through rows starting from the 3rd: 
            for (Row row : mySheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                //go through columns (cells):
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String employeeID = cell.getStringCellValue().concat(" ");
                    employeeList.add(employeeID);
                    }
            }
        } catch (ReadEmployeesList_IOException e) {
            logger.error("File error or IO error: ", e);
        }
        return employeeList;
    }
}




