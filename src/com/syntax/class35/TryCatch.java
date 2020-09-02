package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class TryCatch {

	public static void main(String[] args) {
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/Sample.xls";
		
		try {//code that might throw an exception
			
		FileInputStream fis = new FileInputStream(xlFilePath);
		
		}catch(FileNotFoundException fne) {//catching right exception
			System.out.println("i caugtht the exception");
		}
		
		System.out.println("End of the code");
	System.out.println("-----------------------------");	
		
		int [] array = {10,20,30};
		
		try {
		System.out.println(array[3]);
		
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("I caught Array Index Out O fBounds Exception ");
		}
		
		System.out.println("End of the code");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
