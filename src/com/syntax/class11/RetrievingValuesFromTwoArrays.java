package com.syntax.class11;

public class RetrievingValuesFromTwoArrays {

	public static void main(String[] args) {
		
// month 
		
		String[][] months = {
				{"December", "January","February"},
				{"March","April","MAy"},
				{"June","July","August"},
				{"September", "October","November"}
		};
		
		//Nested loops are maried to 2D Arrays 
		
		int rows = months.length; //how many arrays are inside, how many rows?
 
		System.out.println(rows + "seasons");
		
		int winterLength = months [0].length;// how many elements/columns are in row with index 0?
		System.out.println(winterLength + "monts in row with index 0");
		 
		int lastRowSize = months [3].length;
		
		//int lastRowSize = months [rows-1].length;---->2nd way
		
		for (int i=0; i<months.length; i++) {//iterating over rows
			
			for (int j=0; j<3; j++) {//iterating over column
				
			}
	
		}
		
	}

}
