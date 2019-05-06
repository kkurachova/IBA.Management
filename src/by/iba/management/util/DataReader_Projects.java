package by.iba.management.util;

import by.iba.management.model.exception.ReadFile_IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataReader_Projects {
    private static final String FILE_PATH = "data/ProjectsList.xlsx";
    //private static final Logger logger = LogManager.getRootLogger();
    public static ArrayList<String> readFile() throws IOException {
        ArrayList<String> projectsList = new ArrayList<>();
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
                projectsList.add(str);
            }
        } catch (ReadFile_IOException e) {
            //logger.error("File error or IO error: ", e);
        }
        return projectsList;
    }
}