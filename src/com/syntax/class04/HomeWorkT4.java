package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkT4 {
public static void main(String[] args) {
	
	Scanner scann = new Scanner(System.in);
	//Create a Java program that will ask if user has a credit card or not.
    //If you user does not have a credit card then offer them. 
	//If they do have one ask what is balance on the card? 
	//If balance of the card is larger than 1000, tell them to pay off immediately, 
	//otherwise you can tell them that they can spend more.
	
	System.out.println("Do you have a credit card? Please type True or False");
	boolean credit = scann.nextBoolean();
	   
    
	if (!credit) {
		System.out.println("Would you like open one?");
	}else {
		System.out.println("What is balance on the card?");
		int balance = scann.nextInt();
		if (balance > 1000) {
			System.out.println("You should pay off immediatly!");
		}else {
			System.out.println("You can spend more!");
		}
	}
	
	
	
	
	
	
}
}
