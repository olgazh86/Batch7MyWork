package com.syntax.class06;

import java.util.Scanner;

public class HomeSwitchT2 {
	public static void main(String[] args) {
		
	//Allow user to enter grade and then provide explanation: A-Excellent, B-Good, 
	//C-Average, D-Bad, any other grade --> Not Acceptable. 
	//At the end your program should print which grade was entered by a user with explanation.
		
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade");
		String grade = scan.next();
		String explain = "Unknow";
		
		switch (grade) {
		case "A":
			explain="Excellent";
		break;
		case "B":
			explain="Good";
		break;
		case "C":
			explain="Average";
		break;
		case "D":
			explain="Bad";
		break;
		default:
			explain="Not Acceptable";
		break;	
	}
		System.out.println("Your entered grade is "+ grade +" what is " +explain);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
