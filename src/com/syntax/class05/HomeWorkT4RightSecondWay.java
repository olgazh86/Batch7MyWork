package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkT4RightSecondWay {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a=scan.nextInt();
		
		System.out.println("Please enter the second number");
		int b=scan.nextInt();
		
		System.out.println("Please enter the third number");
		int c=scan.nextInt();
		int largest;
		
		if (a>b) {
			//here a is already larger than b
			if (a>c) {
				//a is the larger
	 		largest =a;
				//a is larger then b, but c is larger than a
			}else {
				largest =c;
			}
		}else {
			//here b is already larger than a 
			if(b>c) {
				//b is the largest
				largest=b;	
			}else {
				//b is larger than a, but c is larger than b
				largest=c;
			}
		}
		System.out.println("Largest number is "+largest);
		
		
		

	}

}
