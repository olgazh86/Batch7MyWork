package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//ask users name  and print 
		
		
	int nam = 1;
	
	while (nam<=5) {
		System.out.println("Please enter your name");
		String name =scan.nextLine();
		
		System.out.println("Goog Afternoon " + name);
		nam ++;
	}
	
	
	// print name 5 times 
	//System.out.println(“Please enter your name”);
	//String name =scan.nextLine();
		
	//System.out.println(“Goog Afternoon ” + name);	
		
	//int nam = 1;
	
	//while (nam<=5) {
		//System.out.println(“Goog Afternoon ” + name);
		//nam ++;
	//}
	
	
	
	//Do while will run 5 times same 
	
	do  {
		System.out.println("Please enter your name");
		String name =scan.nextLine();
		
		System.out.println("Goog Afternoon " + name);
		nam ++;
	}while (nam<=5);
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
