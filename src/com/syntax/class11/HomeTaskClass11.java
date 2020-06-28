package com.syntax.class11;

public class HomeTaskClass11 {

	public static void main(String[] args) {
		
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and 
		//Smith, Jordan, Jackson, Obama.After storing values
		//print the following:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] names = {
				{"Mrs", "Mr","Ms","Miss"},
				{"Smith","Obama","Jackson","Jordan"}
		};
		System.out.println(names[0][0]+" "+names[1][0]);
		System.out.println(names[0][1]+" "+names[1][1]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][3]);
		
		
		
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has A and B grade
		
		String[][] namesGrade = {
				{"Olga", "Olivia","Amaliya","Elsa"},
				{"B","A","C","D"}
		};
		System.out.println(namesGrade[0][0]+" has a grade "+namesGrade[1][0]);
		System.out.println(namesGrade[0][1]+" has a grade "+namesGrade[1][1]);
		System.out.println(namesGrade[0][2]+" has a grade "+namesGrade[1][2]);
		System.out.println(namesGrade[0][3]+" has a grade "+namesGrade[1][3]);
		
		
		
		
		
	}

}
