package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkCL8Task2 {
	
	
////Write a program to ask a user to enter item they want to buy and the price of that item.
	////Every time user enters money accumulate the amount and tell the user how much is left 
	//to pay off.If user give more money program should return a change.
	//Whenever a user done with payments program should say "Thank you for shopping!"
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter item you want to buy");
		String item = scan.nextLine();
		
		System.out.println("Please enter the price of that item");
	    double price = scan.nextDouble();
	    
	    System.out.println("Please enter your amount");
	    double user = scan.nextDouble();
		
		if(price <= user) {
			System.out.println("Your change is "+ (user-price));
		}else {
			System.out.println("You need to pay off " + (price-user));
		}
		System.out.println("Thank you for shopping!");
		
		
		System.out.println("********************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
