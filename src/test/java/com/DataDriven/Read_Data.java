package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static String value;  // null
	public static Workbook wb;
	
	
	   public void file_Data() throws IOException {

		   File f = new File("C:\\Users\\ELCOT\\Desktop\\Data Driven (DEMO).xlsx");
			FileInputStream fis  = new FileInputStream(f);
			 wb = new XSSFWorkbook(fis);
	}
	
	

	public static String particular_Cell() throws IOException {
		
		
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell c = r.getCell(0);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		}
		else if(type.equals(CellType.NUMERIC)){
			double numericCellValue = c.getNumericCellValue();
			
			//int value = (int)numericCellValue;
			//double to String
			
		    value = String.valueOf(numericCellValue);
			
			
		}
	
		
		
		return value;
	}
	
	public static  void particular_Row() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\Desktop\\Data Driven (DEMO).xlsx");
		FileInputStream fis  = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
	    Row r = s.getRow(1);
	    int cells = r.getPhysicalNumberOfCells();
	    for(int j = 0 ; j<cells;j++) {
	    	Cell c = r.getCell(j);
	    	CellType type = c.getCellType();
    		
    		if(type.equals(CellType.STRING)) {
    			String value = c.getStringCellValue();
    			System.out.print(value + " ");
    		}
    		else if (type.equals(CellType.NUMERIC)) {
    			double d = c.getNumericCellValue();
    			
    			
    			String value = String.valueOf(d);
    			System.out.print(value + " ");
    		}
    		
    	}
    	System.out.println();
    	
    }		

	public static void particular_column() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Data Driven (DEMO).xlsx");
		FileInputStream fis  = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for (Row row : s) {
			Cell c = row.getCell(0);

            CellType type = c.getCellType();
 		
 		if(type.equals(CellType.STRING)) {
 			String value = c.getStringCellValue();
 			System.out.println(value + " ");
 		}
 		else if (type.equals(CellType.NUMERIC)) {
 			double d = c.getNumericCellValue();
 			
 			System.out.println("PARTICULAR COLUMN");
 			
 			String value = String.valueOf(d);
 			System.out.println(value + " ");
 		}
 		
		}
		System.out.println();
		
	}
	public static void all_Data() throws IOException {

		File f  = new File("C:\\Users\\ELCOT\\Desktop\\Data Driven (DEMO).xlsx");
		FileInputStream fis  = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet s = wb.getSheetAt(0);
	    int no_Of_Rows = s.getPhysicalNumberOfRows();
	    for(int i = 0;i<no_Of_Rows;i++) {
	    	Row r = s.getRow(i);
	    	int numberOfCells = r.getPhysicalNumberOfCells();
	    	for(int j= 0;j<numberOfCells;j++) {
	    		Cell c = r.getCell(j);
	    		
	    		CellType type = c.getCellType();
	    		
	    		if(type.equals(CellType.STRING)) {
	    			String value = c.getStringCellValue();
	    			System.out.print(value + " ");
	    		}
	    		else if (type.equals(CellType.NUMERIC)) {
	    			double d = c.getNumericCellValue();
	    			
	    			
	    			
	    			String value = String.valueOf(d);
	    			System.out.print(value + " ");
	    		}
	    		
	    	}
	    	System.out.println();
	    }		
		
	}
	public static void main(String[] args) throws IOException {


		 System.out.println("PARTICULAR CELL");
    	 	
    	
    	 System.out.println("PARTICULAR ROW");
		 particular_Row();
		
		 System.out.println("PARTICULAR COLUMN");
		 particular_column();
		 
		 System.out.println("ALL DATA");
		 all_Data();
		
	}
	
}
