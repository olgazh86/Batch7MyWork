package com.syntax.class26;

public class FileTest {

	public static void main(String[] args) {
		
		System.out.println("-----JAva------");
		File java = new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		System.out.println("--------Word---------");
		
		File word = new WordFile();
		word.open();
		word.edit();
		word.close();
		
		
		System.out.println("----------PDF------------");
		File pdf = new PdFile();
		pdf.open();
		pdf.edit();
		pdf.close();
	}

}
