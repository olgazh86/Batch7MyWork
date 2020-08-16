package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {

	public static void main(String[] args) throws IOException {
		//writing to existing file
		String file = "configs/Example.properties";
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties p = new Properties();
		p.load(fis);
		
		p.setProperty("street","New Brook Drive");
		
		//create new file from java code
		String newFile = "configs/NewFile.properties";
		
		FileOutputStream fos = new FileOutputStream(newFile);
		       // fos + comment 
		p.store(fos, "Added additional key");
		

		
		
		
		

	}

}
