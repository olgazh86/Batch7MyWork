package com.syntax.class15;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please, enter any word");
		String word = scan.nextLine();
	
		String newString="";
		
		for(int i= word.length()-1; i >=0;i--) {
		 newString+=word.charAt(i);
		}
		System.out.println(newString);
		
		
		
		
		
		
		
	}

}
