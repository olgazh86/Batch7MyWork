package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkClass08 {

	public static void main(String[] args) {
	//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range prints the sum of the even and odd 
		//integers.
		//found total
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number");
		int start = scan.nextInt();
		
		System.out.println("Please enter end number");
		int end = scan.nextInt();
		
		 int sumEven=0;
		 int sumOdd=0;
		 int total=0;
		 
		for (int i = start; i <= end;i++) {
			if (i%2==0) {
			sumEven+=i;	
			}else {
				sumOdd+=i;
				// 1way 
				//total+=i;
				
				
			}
		}
		System.out.println("The sum of even is "+ sumEven+" and sum of odd is "+sumOdd);
		//second way
		total= sumEven + sumOdd;
		
		
		
	}

}
