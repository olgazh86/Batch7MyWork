package com.syntax.class05;

import java.util.Scanner;

public class ScannLogicalOperators {

	public static void main(String[] args) {
		
		//take the age from the user and then
		//if age between 0-3----> you are baby
		//if age between 4-5----> you are kid
		//if age between 6-12----> you are a child 
		////if age between 13-19----> you are teenager
		//if age between 20-64---> you are adult
		//if age between 20-64----> you are senior
		
		Scanner scan = new Scanner(System.in);
System.out.println("Please enter your age");

		int age = scan.nextInt();
		
		if (age >= 0 && age <= 3) {
			System.out.println("you are baby");
		} else if (age >= 4 && age <= 5) {
			System.out.println("you are kid");
		}else if (age >= 6 && age <= 12) {
			System.out.println("you are child");
		}else if (age >= 13 && age <= 19) {
			System.out.println("you are teenager");
		}else if (age >= 20 && age <= 64) {
			System.out.println("you are adult");
		}else if (age >= 65) {
			System.out.println("Enjoy life");
		}else {
			System.out.println("That wasn't a correct age");
		}
		
		
		
		
	}

}