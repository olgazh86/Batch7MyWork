package com.syntax.class04;

public class NestingElseIF {
public static void main(String[] args) {
	
	//check score
	//if score >90 ---- A, Great Job!
	//if score>80----B, Well done!
	//if score>70 ----C, Just passed!
	//otherwise -- F,You failed!
	
	///not complete --- Please finish you quiz!
	
	
	boolean completed = true;
	int score = 82;
	
		if (completed) {
		if (score>90) {
			System.out.println("A, Great Job!");
		}else if (score>80) {
			System.out.println("B, Well done!");
			
		}else if (score>70) {
			System.out.println("C, Just passed!");
			
		}else {
			System.out.println("F,You failed!");
		}	
		}else {
			System.out.println("Please finish you quiz!");
		}
		
		
		
	
	
}
}
