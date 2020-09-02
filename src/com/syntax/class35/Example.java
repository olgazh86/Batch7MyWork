package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		//How would handle InputMismatchException? 
		//Input Mismatch Exception when user enters mismatch value
		//then programmer expected.
		
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number");
		try {		
			int num = sc.nextInt();
		}catch(InputMismatchException ime) {
			System.out.println("Find Mismatch exeption");
		}
		System.out.println("Please enter NUMBER");
	}

}
