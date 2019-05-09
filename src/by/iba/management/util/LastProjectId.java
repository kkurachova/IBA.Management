package by.iba.management.util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LastProjectId {

    private static final String FILE_PATH_P = "data/ProjectsList.xlsx";

    public static long getLastProjectId() throws IOException {
        File file = new File(FILE_PATH_P);
        try (FileInputStream in = new FileInputStream(file)) {
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet mySheet = workbook.getSheetAt(0);
            long lastId = mySheet.getLastRowNum();
            return lastId;
        }
    }
}

