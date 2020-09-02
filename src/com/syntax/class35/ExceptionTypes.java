package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {

	public static void main(String[] args) {
		
		//Checked exception are the E that checked by the compiler
		
		//Thread.sleep(2000);//checked exception
		String xlFilePath = System.getProperty("user.dir") + "/testdata/Sample.xls";
		//FileInputStream fis = new FileInputStream(xlFilePath);//if file is not there obj of FileNotFoundException
		//will be throwing
		
		
		//unchecked E  = are E that not checked by the compiler
		int a= 12;
		int b = 0;
		//System.out.println(a/b);//ArithmeticExeption
		
		String str= null;
		//System.out.println(str.length());//NullPointerException

	}

}
