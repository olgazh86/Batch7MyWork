package com.syntax.class12;

public class InterviewQuestion3 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int num =10, a=0, b=1;
		for (int i =1; i<=num;i++) {
			System.out.print(a + " + ");
			
			int sum = a+b;
			a=b;
			b = sum;
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
