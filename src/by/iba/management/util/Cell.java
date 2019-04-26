package by.iba.management.util;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.util.Date;
import java.util.Objects;

public class Cell {
    private boolean isString;
    private boolean isNumeric;
    private boolean isBoolean;

    public Cell(boolean isString, boolean isNumeric, boolean isBoolean) {
        this.isString = isString;
        this.isNumeric = isNumeric;
        this.isBoolean = isBoolean;
    }

    public boolean isString() {
        return isString;
    }

    public void setString(boolean string) {
        isString = string;
    }

    public boolean isNumeric() {
        return isNumeric;
    }

    public void setNumeric(boolean numeric) {
        isNumeric = numeric;
    }

    public boolean isBoolean() {
        return isBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        isBoolean = aBoolean;
    }

    public void setCellValue(String obj) {}
    public void setCellValue(boolean obj) {}
    public void setCellValue(Date obj) {}
    public void setCellValue(Double obj) {}

    public boolean isCellEmpty(final XSSFCell cell) {
        if (cell == null) { // use row.getCell(x, Row.CREATE_NULL_AS_BLANK) to avoid null cells
            return true;
        }

        if (cell.getCellType() == CellType.BLANK) {
            return true;
        }

        if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().trim().isEmpty()) {
            return true;
        }

        return false;
    }
}
