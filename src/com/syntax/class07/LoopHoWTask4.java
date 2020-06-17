package com.syntax.class07;

public class LoopHoWTask4 {

	public static void main(String[] args) {
		//Print odd numbers between 20 and 50 (2 ways)
		
		//1st way
		for (int num=21; num<=49;num+=2) {
			System.out.println(num);
		}	
		
		
		//2d way
		int num2 = 21;
		do {
			System.out.print(num2+ " ");
		num2+=2;
		}while (num2<=49);
		
		
	//teacher way//////////////////////////////////////		
		//1 way 
		
		for(int i=20; i<=50; i++) {
			System.out.println(i);
			
			if (i%2==1) {
				System.out.println(i); 
				
			}	
		}
		//2nd way
		
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		
		
		///////
		
		for(int j =5; j>=1; j--) { ////////for(int j =5; j<=1; j--) don't work
			System.out.println(j);//////////for(int j =5; j>0; j--) print 
		}
		
		
		
	}
	
}
