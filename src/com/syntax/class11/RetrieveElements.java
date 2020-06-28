package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);//System.out.print(grades[i]+ ",") one line
		}
		
		
	System.out.println("--------------------------------------");	
		
	// print using advanced loop
		
		for (char element : grades) {
			System.out.print(element+ " ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------");	
	///Task: print all the fruits in two different way	
		
		String[] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber"};
		//1st 
		for (int i=0; i<fruits.length;i++) {
			System.out.print(fruits[i]+ " ");
		}
		System.out.println();
		//2 way
	for (String line : fruits) {
		System.out.print(line + " ");
	}
		
	
		
		

	}

}
