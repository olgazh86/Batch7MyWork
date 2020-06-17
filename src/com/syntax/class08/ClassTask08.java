package com.syntax.class08;

import java.util.Scanner;

public class ClassTask08 {

	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		
		
		
		for(int i= 1; i <=50; i++) {
			if (i%3==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int a= 1; a<=10; a++) {
			System.out.println("Do you want applay for credit card");
			String answer = scan.nextLine();
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Thank you");
				break;
			}
			
			
		}
		
		
		
		

	}

}
