package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap {

	public static void main(String[] args) throws IOException {
		String xlFilePath = System.getProperty("user.dir") + "/testdata/Sample.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);
		// create an Object of Workbook
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		// get number of row and cols
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		List<Map<String,String>> xlList = new ArrayList<>();
		//using nested loop
		
		for(int r =1; r<rows; r++) {
			
			Map<String, String> lmap = new LinkedHashMap<>();
			
			for(int c=0; c<cols; c++) {
				
				lmap.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());
				
			}
			xlList.add(lmap);
		}
		System.out.println(xlList);

	}

}
