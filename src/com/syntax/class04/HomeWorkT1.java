package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkT1 {
public static void main(String[] args) {
	
	//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
	//If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the amount of loan you needed");
	
	int loan = scanner.nextInt();
	     if (loan<=200000) {
	    	 System.out.println("Congratulations! Your loan is approved!");
	     }else {
	    	 System.out.println("Sorry, your loan is denied");
	     }
	
	
	
	
	
	
	
}
}
