package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandling {

    public static String retriveData(String sheetName, int row , int column) throws IOException {

       String path = System.getProperty("user.dir");

        File filePath = new File(path +"/src/main/resources/Data/DataSheet.xlsx");
        FileInputStream fileInputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String cellValue = sheet.getRow(row).getCell(column).getStringCellValue();
        return cellValue;
    }



}
