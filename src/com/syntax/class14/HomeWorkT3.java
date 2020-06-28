
package com.syntax.class14;

public class HomeWorkT3 {

	public static void main(String[] args) {
		//1. Create a String and print it in reverse order (Sunday → yadnuS).
		
		String day = "Sunday";
		
		String newString="";
		
		for(int i= day.length()-1; i >=0;i--) {
		 newString+=day.charAt(i);
		}
		System.out.println(newString);
		
		
		
		

	}

}
