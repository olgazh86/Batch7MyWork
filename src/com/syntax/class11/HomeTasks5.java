package com.syntax.class11;

public class HomeTasks5 {

	public static void main(String[] args) {
		//Create a 2D array of integer type with 3 rows and 4 columns
		//and print all values of the whole array.
		
		int[][] numbers = {
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		for (int row = 0; row< numbers.length; row++) {
		   for(int col =0; col< numbers[row].length; col++) {
			   System.out.println(numbers [row][col]+ " ");
		   }
		}
		
	}

}
