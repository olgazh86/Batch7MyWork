package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
	
		String[][]animals = {
				{"cat", "dog", "bird","hamster"},// first array or 1st row
				{"tiger", "bear","lion"},  //second array or 2nd row
				{"salmon", "shrimp", "sea bass"}
		};
		

		int howManyArrays = animals.length;// how many rows
		System.out.println(howManyArrays);
		
		int element1Array = animals[1].length;// how many columns in 2 row
		System.out.println(element1Array);
		
		String element = animals [1][1];
		System.out.println(element);
		
		// how to get all elements from 2D array
		
		for (int r=0; r<animals.length;r++) { 
			for (int c=0; c<animals[r].length; c++ ) {
				String animal=animals [r][c];
				
				System.out.print(animal + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("---------Using Enhanced for loop------------");
		
		for (String[]array:animals) {
			
			for (String animal:array) {
				System.out.print(animal + " ");
			}
		}
		
		
		
	}

}
