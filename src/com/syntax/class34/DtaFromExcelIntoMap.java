package com.syntax.class34;

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

public class DtaFromExcelIntoMap {

	public static void main(String[] args) throws IOException {
		
		
		String xlFilePath = System.getProperty("user.dir")+ "/testdata/Sample.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFilePath);
		// create an Object of Workbook
		Workbook book= new XSSFWorkbook (fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		//get number of row and cols
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		//create an empty List
		List<Map<String, String>> xlList = new ArrayList<>();
		
		//loop over every row
		for(int r = 1; r<rows; r++) {//iter rows
			
			Map<String, String> map=new LinkedHashMap<>();
			//loop over every column
			for(int c = 0; c<cols; c++) {//iter colum
				//get key from 1 row (header)
				String key = sheet.getRow(0).getCell(c).toString();
				
				//get values from other rows
				String value = sheet.getRow(r).getCell(c).toString();
				//store values from each cell of the row into Map
				map.put(key, value);
			}
			//add created map with values into List
			xlList.add(map);
			
		}
		System.out.println(xlList);
		System.out.println("-----Printing maps 1 by 1 from our List---------");
		for(Map<String, String> littleMap:xlList) {
			System.out.println(littleMap);
		}

	}

}
