package com.emir.tests;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class demonstrates how to write data to an existing Excel file using Apache POI library.
 */
public class ExcelWrite {

    /** Path to the Excel file. */
    String filePath = "SampleData.xlsx";

    /** Workbook representing the Excel file. */
    XSSFWorkbook workbook;

    /** Sheet within the workbook. */
    XSSFSheet sheet;

    /**
     * Writes data to an existing Excel file.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void excelWrite() throws IOException {
        // Open FileInputStream to read the Excel file
        FileInputStream fileInputStream = new FileInputStream(filePath);

        // Initialize the workbook and sheet objects
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");

        // Write data to the Excel sheet
        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(110000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(135000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(125000);

        // Modify Mike's last name to Jackson
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mike")) {
                sheet.getRow(rowNum).getCell(1).setCellValue("Jackson");
            }
        }

        // Open FileOutputStream to write changes to the file
        FileOutputStream outputStream = new FileOutputStream(filePath);

        // Write changes to the workbook
        workbook.write(outputStream);

        // Close FileOutputStream, workbook, and FileInputStream
        outputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}
