package com.syntax.class14;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
	/*Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
	 * 
	 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mom's first name?");
		String mom = scan.nextLine();
		
		System.out.println("Dad's first name?");
		String dad = scan.nextLine();
		
		System.out.println("Who you expecting boy or girl?");
		String gender = scan.nextLine();
		
		if(gender.equalsIgnoreCase("girl")) {
			System.out.println(mom.substring(0,1).concat(dad.substring(dad.length()-3)));
		}else if(gender.equalsIgnoreCase("boy")){
			System.out.println(dad.substring(0,3).concat(mom.substring(mom.length()-2)));
		}else {
			System.out.println("Wrong input");
		}
		
 //momsName.substring(0, momsName.length() / 2) + dadsName.substring(dadsName.length() / 2)
		
		//babyName.toUpperCase();


		
		
		
		
		
		
		
		
		
		

	}

}
