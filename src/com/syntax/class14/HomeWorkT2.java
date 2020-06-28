package com.syntax.class14;

public class HomeWorkT2 {

	public static void main(String[] args) {
		
		/*
		 * 1. Create a String and if the String is not empty perform the following: 
         * if the String has an odd number of characters and has 3 or more characters, 
         * print the character in the middle of the String.
		 */
		
		
		String string="Java Giving Me HeadAche";
		
			int size=string.length();
			
		if (!string.isEmpty()) {
			if((size%2==1 && size>=3)) {
				int print =(size/2);
				
				System.out.println(string.charAt(print));
			}else {
				System.out.println("Wrong output");
			}
		}
		
		
		
		
		
	}

}
