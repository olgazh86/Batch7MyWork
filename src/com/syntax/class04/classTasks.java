package com.syntax.class04;

public class classTasks {

	public static void main(String[] args) {
	
	boolean diploma  = true;
	double gpa = 3.5;
	
	if (diploma) {
		System.out.println("Congratulation!");
		
		if (gpa>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else {
		System.out.println("You should have studied harder");
		}
	}else {
			System.out.println("Get a degree");

		}
	
	
	System.out.println("#########################");
	
	double rate = 3.5;
	double price = 5000000;
	
	if (rate>4.5) {
		System.out.println("not buy a house");
	}else {
		System.out.println("will consider buying");
		if (price > 200000) {
			System.out.println("take a loan");
			}else {
				System.out.println("Pay cash");
			}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	}

}

