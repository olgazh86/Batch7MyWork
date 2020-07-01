package com.syntax.class15;

import java.util.Scanner;

public class HomeWorkT3 {

	public static void main(String[] args) {
		// 1. How would you check if String is palindrome or not?
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please, enter any word");
		String word = scan.nextLine();
	
		String newString="";
		
		for(int i= word.length()-1; i >=0;i--) {
		 newString+=word.charAt(i);
		}
		if (newString.equalsIgnoreCase(word)) {
			System.out.println("Palindrome "+ word);
		}else {
		System.out.println("It is not palindrome");
		}
		
		
		
		

	}

}
