package com.syntax.class16;

public class Tasks {
	
	
	//1.Create a method that will take 2 parameters 
	//as a numbers and prints which number is larger.
	
	void numPrint(int a, int b) {
		if (a>b) {
			System.out.println("Number is larger"+ a);
		}else {
			System.out.println("Number is smaller" + b);
		}
	}
	//2.Create a method that will take 
	//a number and prints whether the number is even or odd.
	void EvenOdd(int a) {
		if (a%2==0) {
			System.out.println("Entered number is even");
		}else {
			System.out.println("Entered number is odd");
		}
	}
	//3.Create a method that will print whether given String is palindrome or not.
	
	void word (String word1) {
		String newString="";
		for(int i= word1.length()-1; i >=0;i--) {
			 newString+=word1.charAt(i);
			}
			if (newString.equalsIgnoreCase(word1)) {
				System.out.println("Palindrome "+ word1);
			}else {
			System.out.println("It is not palindrome");
			}
	}

	
	//4.Create a method that will say Hello in different language based
	//on the country that will passed when method is executed.
	
	void language(String country) {
		if (country.equalsIgnoreCase("Russia")) {
			System.out.println("Привет");
		}else if (country.equalsIgnoreCase("USA")) {
			System.out.println("Hi");
		}else {
			System.out.println("Error");
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
	//1.	
		Tasks larg = new Tasks();
		
		larg.numPrint(10,40);
    //2.
		larg.EvenOdd(22);
		
	//3.	
		larg.word("level");
		
	//4.
		larg.language("Usa");
		
	}
	
	

}
