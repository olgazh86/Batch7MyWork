package com.syntax.class11;

public class HomeTask2 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		
		int[][] numbers= {
				{10,15,20,25},
				{32,36,40,44},
				{63,66,69,72}
		};
		for (int row =0; row< numbers.length; row++ ) {
			for (int col =0; col<numbers.length; col++) {
				if(numbers[row][col]%2==0) {
					System.out.print(numbers[row][col]+ " ");
				}
			}
		}
		
		System.out.println();
		
		System.out.println("************************************************");
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
		
		int sum = 0;
		int[][] num= {
				{10,15,20},
				{32,36,40},
				{63,66,69}
		};
		for (int r=0; r<num.length;r++) {
			for (int c=0;c<num.length; c++) {
				sum = sum+num[r][c];
			}
			
		}
		System.out.println("The sum of arrays is: " +sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
