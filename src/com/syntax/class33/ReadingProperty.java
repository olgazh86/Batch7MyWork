package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperty {

	public static void main(String[] args) throws IOException {

		
		///Users/volhazhmurko/eclipse-workspace/JavaBasics/configs/Example.properties
		//1. identify path to the file you would like to read
		String filePath = "configs/Example.properties";
		
		//2. create an obj of FileInputStream class
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//3. to work with property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fis);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String city = prop.getProperty("city");
		System.out.println(city);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		String adress = prop.getProperty("adress");
		System.out.println(adress);
		
	}

}
