package com.syntax.class05;

import java.util.Scanner;

public class Task3Class05 {

	public static void main(String[] args) {
  // Write a program that will read three inputs of scores 
		//(quiz, mid term, and final scores) 
			//and determine the grade based on the following rules: 
		//if the average score >=90 → grade=A
	   //if the average score >= 70 and <90 → grade=B
	  //if the average score>=50 and <70 → grade=C
	//if the average score<50 → grade=F

		Scanner scan = new Scanner(System.in);
		
        System.out.println("Please enter score of your quiz");
		int quiz = scan.nextInt();
		System.out.println("Please enter score of your mid term");
		int midTerm = scan.nextInt();
		System.out.println("Please enter score of your final score");
		int finale = scan.nextInt();
		
		double score = (quiz + midTerm + finale)/3;
		
		if (score >= 90){
			System.out.println("Your grade is A");
		}else if (score >=70 && score < 90) {
			System.out.println("Your grade is B");
		}else if (score >= 50 && score <70) {
			System.out.println("Your grade is C");
		}else if (score <50) {
			System.out.println("Your grade is F");
		}else {
			System.out.println("Study hard!");
		}
		
		
		
	}

}
