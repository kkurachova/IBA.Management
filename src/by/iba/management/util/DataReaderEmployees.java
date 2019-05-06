package by.iba.management.util;

import by.iba.management.model.exception.ReadFileIOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DataReaderEmployees {
    private static final String FILE_PATH = "data/EmployeesList.xlsx";
    //private static final Logger logger = LogManager.getRootLogger();
    public static ArrayList<String> readFile() throws IOException {
        ArrayList<String> employeeList = new ArrayList<>();
        File file = new File(FILE_PATH);
        try (FileInputStream in = new FileInputStream(file)) {
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet mySheet = workbook.getSheetAt(0);
            for (Row row : mySheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                String str = new String();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    str+=cell.getStringCellValue() + " ";
                }
                employeeList.add(str);
            }
        } catch (ReadFileIOException e) {
            //logger.error("File error or IO error: ", e);
        }
        return employeeList;
    }
}
