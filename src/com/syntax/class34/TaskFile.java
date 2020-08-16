package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskFile {

	public static void main(String[] args) throws IOException {
		// Manually create a file to store username and password
		//Using Java add 2 more lines for username and password 
		//Save code in the same file
		
		String xlFile = System.getProperty("user.dir") + "/testdata/MyFile2.xlsx";

		FileInputStream fis = new FileInputStream(xlFile);
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		sheet.createRow(1).createCell(0).setCellValue("syntax");
		sheet.getRow(1).createCell(1).setCellValue("syntax123");
		
		sheet.createRow(2).createCell(0).setCellValue("tampa");
		sheet.getRow(2).createCell(1).setCellValue("tampa123");
		
		FileOutputStream fos = new FileOutputStream(xlFile);
		workbook.write(fos);
		
		fis.close();
		fos.close();
		
		
		
		
		

	}

}
