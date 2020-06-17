package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	//Capture the name from the user and print
		//your name is
		
		//ask the user to enter the age and print 
		//your name is ___and age__ is 
		
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Please enter your full name!");
		String name = input.nextLine();
		System.out.println("Your name is " + name);
	
        System.out.println("PLease enter your age as double");
         double albAge = input.nextDouble();
System.out.println("Your name is " + name + " and age is" + albAge);
        






	}

}
