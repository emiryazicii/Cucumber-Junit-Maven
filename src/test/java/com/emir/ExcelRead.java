package com.emir;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This class demonstrates how to read data from an Excel file using Apache POI library.
 */
public class ExcelRead {

    /**
     * Reads data from an Excel file.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void readFromExcelFile() throws IOException {
        // Path to the Excel file
        String path = "SampleData.xlsx";

        // Create a FileInputStream to read from the Excel file
        FileInputStream fileInputStream = new FileInputStream(path);

        // Create a workbook instance to represent the Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the specific sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // Print out specific cell values from the sheet
        System.out.println("Employee 1: " + sheet.getRow(1).getCell(0)); // Mike's name
        System.out.println("Employee 3: " + sheet.getRow(3).getCell(2)); // Developer's job title
        System.out.println("Employee 4: " + sheet.getRow(4).getCell(0)); // Lisa's name

        // Get the count of used rows in the sheet
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of used rows: " + usedRows);

        // Get the index of the last used row in the sheet
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("Index of the last used row: " + lastUsedRow);

        // Find and print Vrath's name dynamically
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vrath")) {
                System.out.println("Vrath's name found at row " + (rowNum + 1));
            }
        }

        // Find and print Melisa's job ID
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Melisa")) {
                System.out.println("Melisa's JOB_ID: " + sheet.getRow(rowNum).getCell(2));
            }
        }

        // Close the workbook and release resources
        workbook.close();
        fileInputStream.close();
    }
}
