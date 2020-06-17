package com.syntax.class06;

import java.util.Scanner;

public class HomeSwitchT3 {
public static void main(String[] args) {
	
// Using scanner class create calculator. Allow user to enter 2 numbers 
	//and operator(+,-,*,/). Based on operator provide the result to user.	
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Please enter first number");
	int num1= scan.nextInt(); //double num1;
	
	System.out.println("Please enter second number");
	int num2= scan.nextInt();
	int sum=0;//double sum;
	
	System.out.println("Please enter operator(+,-,*,/");
	char myChar = scan.next().charAt(0);
	
	switch(myChar) {
	case '-':
	 System.out.println(sum = num1-num2);//sum =num1-num2;
	break;
	case '+':
		System.out.println(sum = num1+num2);
	break;
	case '*':
		System.out.println(sum = num1*num2);
	break;
	case'/':
		System.out.println(sum = num1/num2);
	break;	
	}
	System.out.println("Your result is "+ sum);
	
	
	
	
}
}
