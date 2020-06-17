package com.syntax.class05;

import java.util.Scanner;

public class recap {
//Create a Java program that will ask if user has a credit card or not. 
	//If you user does not have a credit card then offer them. 
	//If they do have one ask what is balance on the card? 
	//If balance of the card is larger than 1000, tell them to pay off 
	//immediately, otherwise you can tell them that they can spend more.
	
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
        boolean cc;
        
		System.out.println("Do you have a cc?True or Fals?");
		cc = myScanner.nextBoolean();
		if (cc) {
			System.out.println("What is your cc balance?");
			
			
			double balance = myScanner.nextDouble();
			if (balance>=1000) {
				System.out.println("Pay off immediatly!");
			}else {
				System.out.println("Spend more!");
			}
		}else {
			System.out.println("Do you want to applay for are best Credit Card!");
		}
		
		
		
		
			}
		}
	



