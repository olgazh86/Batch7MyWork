package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkT2 {
public static void main(String[] args) {
	//You are DMV representative and you need to ask customer their age. 
	//If they are 18 and older you will issue a driver licence to them, 
	//otherwise you will offer them to get a learners permit.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please, enter your age (number).");
	
	int age = scan.nextInt();
	
	if (age>=18) {
		System.out.println("Congratulation, you get a driver's license.");
	}else {
		System.out.println("Sorry, you get lerners permit");
	}
	
	
	
	
	
	
}
}
