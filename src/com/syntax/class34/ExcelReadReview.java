package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {

	public static void main(String[] args) throws IOException {
		
		String xlFile= System.getProperty("user.dir")+"/testdata/Sample.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFile);
		
		Workbook wbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wbook.getSheet("test");
		
		Row row2 = sheet.getRow(1);
		
		String cellValue = sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		//how to get values from all rows and all columns?
		
		//1. get numbers of rows
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		//2. get numbers of columns
		
		int cols = sheet.getRow(0).getLastCellNum();//or getPhysicalNumberOfCells
		
		//3.
		for(int r = 0; r<rows; r++) {//iterates over rows
			
			for(int c=0; c<cols; c++) {//iterates over columns
				
				String value = sheet.getRow(r).getCell(c).toString();
	
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
		
		

	}

}
