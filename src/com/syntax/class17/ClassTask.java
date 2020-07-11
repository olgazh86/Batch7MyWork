package com.syntax.class17;

public class ClassTask {
	public static void main(String[] args) {
		
	
	
	ClassTask abc = new ClassTask();
	
	//1
	String createEmail= abc.gmail("John","Snow", "gmail");
     System.out.println(createEmail);

	
	//2
	boolean prime =abc.primeOrNot(3);
	System.out.println(prime);

	
	}

	
	
	//   1.    Create a method createEmail(). Based on values of users name, 
	//lastName and email type, your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
	
	
	String gmail(String name, String lastName, String emailType) {
		String createEmail=name+lastName+"@"+emailType+".com";
		return createEmail.toLowerCase();
	}
	                             
	
	//2. Write a method to return whether given number is prime or not?
	
	boolean primeOrNot(int a) {
		boolean prime = true;
		
		if (a > 1) {
			for (int i = 2; i <= a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
