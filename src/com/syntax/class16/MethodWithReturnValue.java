package com.syntax.class16;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="I love Java";
		
		int length = str.length();
		if (length>=10) {
			System.out.println("Created String is long");
		}else {
			System.out.println("Created String is short");
		}
	}
	
	// create a method that RETURN the largest number 
	int largest(int a,int b) {
		int largest;
		if (a>b) {
			largest=a;
		}else {
			largest=b;
		}
		return largest;
	}
}

