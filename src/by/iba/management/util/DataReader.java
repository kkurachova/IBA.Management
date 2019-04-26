package by.iba.management.util;

import by.iba.management.model.entity.EmployeesRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

/**
 * Created by katya on 4/26/2019.
 */

public class DataReader {
    public String FILE_PATH = "D:/IBA/Java/javaProjects/IBA.Management/data/EmployeesList.xlsx";;
    public DataReader() throws IOException {
        try {
            File employeesList = new File(FILE_PATH);
            FileInputStream fis = new FileInputStream(employeesList);
            XSSFWorkbook employeesListXSSF = new XSSFWorkbook (fis);
            XSSFSheet mySheet = employeesListXSSF.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                    }
                }
            }

        catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        catch (IOException ie) {
            ie.printStackTrace();
        }
        return EmployeesRepository.getEmployeesList();
    }

}



