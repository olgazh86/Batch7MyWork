package com.syntax.class08;

import java.util.Scanner;

public class HomeLottery {

	public static void main(String[] args) {
		
		int total=1;
		for (int k =1; k<=4; k++) {
			total +=k; ///cahnge value of total
		}System.out.println(total);
		
		/// We are playing a lottery game and the lucky number is 17; 
		//We want to keep asking the user to enter any numbers from 1-20;
		//until he guesses the lucky number --> In that case we print "Congrats,
		//you won!"
		
		Scanner scan = new Scanner(System.in);
		
		int lucky = 17;
		int num;
		
		do {
		System.out.println("Please Enter number any number from 1-20");
		num = scan.nextInt();
		
		}while (num != lucky);
			System.out.println("Congrats, you won!");
		

	//////// while loop I have ask two times 
	
			System.out.println("Please Enter number any number from 1-20");
			num = scan.nextInt();
			
	        while (num!= lucky) {
	        System.out.println("Please Enter number any number from 1-20");
			num = scan.nextInt();
	        }
	
	
	
	
	}	
	

}
