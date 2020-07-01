package com.syntax.class15;

import java.util.Scanner;

public class HomeWorkT2 {

	public static void main(String[] args) {
		// 1. How would you reverse a String word by word?
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please, enter any sentence");
		String sentence = scan.nextLine();
		
		String[] word =sentence.split(" ");
		
		for (int x=word.length-1; x>=0; x--) {
			System.out.print(word[x]+ " ");
		}
		
		
		
		
		
		
		
		
	}

}
