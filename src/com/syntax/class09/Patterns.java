package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		//  i want to print this pattern 
         // ****
		/* **** 
		 * ****
		 * ****
		 *  silly way 
		 *  
		 * for (int j=1; j<=4;j++) {
				System.out.println("****");
			}
		 * 
		 * 
		 * 
		 */ 
             // 1 way
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	System.out.println("----------------------");	
		
            for (int a=1; a<=10; a++) {
			
			for (int x=1; x<=10;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
