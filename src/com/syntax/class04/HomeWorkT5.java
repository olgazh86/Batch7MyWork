package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkT5 {
public static void main(String[] args) {
	//Write a program to ask user to enter numbers of worked years and annual salary. 
	//If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
	//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
	int years;
	int salary;
	
	Scanner scann = new Scanner(System.in);
	System.out.println("Please enter numbers of worked years");
	years = scann.nextInt();
   
	 if (years >= 5) {
		 System.out.println("enter number annual salary");
		 salary = scann.nextInt();
		 
	if (salary > 50000) {
		System.out.println("Your bonus is 50000!");
	}else {
		System.out.println("Your bonus is 3000!");
	} 	 
		 
	 }else {
		 System.out.println("Sorry, no bonus");
	 }
	
	
}
}
