package com.syntax.class12;

public class InterviewQuestion2 {

	public static void main(String[] args) {
	//1. Write a java program to check whether a given number is prime or not?

		int num =7;
		boolean red = false;
		
		for (int i=2; i<=num/2; i++) {
			if (num%i==0) {
				red =true;
				break;
			}
		}
		if (!red) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
			
		
		
		
		
		
	}

}
