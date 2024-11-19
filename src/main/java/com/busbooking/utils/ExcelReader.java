package com.busbooking.utils;

	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Iterator;

	public class ExcelReader {

	    public static Object[][] getTestData(String excelfilepath, String sheetName) throws IOException {
	        String String = "C:\\selenium-java-4.25.0";
			FileInputStream fileInputStream = new FileInputStream(new File("C:\\selenium-java-4.25.0"));
	        Workbook workbook = new XSSFWorkbook(fileInputStream);
	        Sheet sheet = workbook.getSheet("BUSticket");

	        Iterator<Row> rowIterator = sheet.iterator();
	        int rowCount = 0;

	        // Counting rows
	        while (rowIterator.hasNext()) {
	            rowIterator.next();
	            rowCount++;
	        }

	        // Create data array
	        Object[][] data = new Object[rowCount - 1][sheet.getRow(0).getPhysicalNumberOfCells()];
	        rowIterator = sheet.iterator();
	        rowIterator.next(); // Skip header

	        int i = 0;
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	                data[i][j] = row.getCell(j).getStringCellValue();
	            }
	            i++;
	        }

	        workbook.close();
	        return data;
	    }

}





