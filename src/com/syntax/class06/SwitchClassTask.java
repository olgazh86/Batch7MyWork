package com.syntax.class06;

import java.util.Scanner;

public class SwitchClassTask {

	public static void main(String[] args) {
		
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your Country");
		String country = scan.next();
		String lang = "Unknow";
		
		
		switch(country) {
		case "USA":
			lang = "English";
			break;
		case "Spain":
			lang = "Spanish";
			break;
		case "Belarus":
			lang = "Belarusian";
			break;
		default:
			lang = "Invalid";
		}
		System.out.println("Your language is " +lang);
		
		
		
		
		
		

	}

}
