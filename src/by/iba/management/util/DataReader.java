package by.iba.management.util;

import by.iba.management.model.entity.*;
import by.iba.management.model.exception.ReadEmployeesList_IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by katya on 4/26/2019.
 */

public class DataReader {
    //private static String FILE_PATH = "D:/IBA/Java/javaProjects/IBA.Management/data/EmployeesList.xlsx";
    private static String FILE_PATH = "D:/IBA/Java/javaProjects/IBA.Management/data/EmployeesList.xlsx";
    private static final Logger logger = LogManager.getRootLogger();
    private static ArrayList<String> employeeList = new ArrayList<>();
    private static Object String;

    public static List<String> readFile() throws IOException {
        File file = new File(FILE_PATH);
        List<String> employeeList = new ArrayList<String>();
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
                    String firstName = cell.getStringCellValue().concat(" ");
                    employeeList.add(firstName);
                    String lastName = cell.getStringCellValue().concat(" ");
                    employeeList.add(lastName);
                    String projectID = cell.getStringCellValue().concat(" ");
                    employeeList.add(projectID);
                    String teamLead = cell.getStringCellValue().concat(" ");
                    employeeList.add(teamLead);
                    String position = cell.getStringCellValue().concat(" ");
                    employeeList.add(position);
                    String engLevel = cell.getStringCellValue().concat(" ");
                    employeeList.add(engLevel);
                    String java = cell.getStringCellValue().concat(" ");
                    employeeList.add(java);
                    String cPlusPlus = cell.getStringCellValue().concat(" ");
                    employeeList.add(cPlusPlus);
                    String cSharp = cell.getStringCellValue().concat(" ");
                    employeeList.add(cSharp);
                    String php = cell.getStringCellValue().concat(" ");
                    employeeList.add(php);
                    String dotNet = cell.getStringCellValue().concat(" ");
                    employeeList.add(dotNet);
                    String sql = cell.getStringCellValue().concat(" ");
                    employeeList.add(sql);
                    String javaScript = cell.getStringCellValue().concat(" ");
                    employeeList.add(javaScript);
                    String html = cell.getStringCellValue().concat(" ");
                    employeeList.add(html);
                    String css = cell.getStringCellValue().concat(" ");
                    employeeList.add(css);
                    String jQuery = cell.getStringCellValue().concat(" ");
                    employeeList.add(jQuery);
                    String manualTest = cell.getStringCellValue().concat(" ");
                    employeeList.add(manualTest);
                    String autoTest = cell.getStringCellValue().concat(" ");
                    employeeList.add(autoTest);
                    String desktopTest = cell.getStringCellValue().concat(" ");
                    employeeList.add(desktopTest);
                    String mobileTest = cell.getStringCellValue().concat(" ");
                    employeeList.add(mobileTest);
                    String visualStudio = cell.getStringCellValue().concat(" ");
                    employeeList.add(visualStudio);
                    String intellijIdea = cell.getStringCellValue().concat(" ");
                    employeeList.add(intellijIdea);
                    String eclipse = cell.getStringCellValue().concat(" ");
                    employeeList.add(eclipse);
                    String netBeans = cell.getStringCellValue().concat(" ");
                    employeeList.add(netBeans);
                    }
            }

        } catch (ReadEmployeesList_IOException e) {
            logger.error("File error or IO error: ", e);
        }
        return employeeList;
    }
}




