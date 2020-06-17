package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	int a = 65;
	String s = "bla";
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Please write some text and press enter!");
    String text =scan.nextLine();
    System.out.println("---------------------");
	System.out.println(text);
	
	
	//int a = (int) "thirty tree";// compile-time error
	
	//let me read an int (age)
	int age = scan.nextInt();//If not an integer, run time error
	System.out.println("The age that you entered is " + age);
	
	

	}

}
