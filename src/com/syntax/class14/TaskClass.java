package com.syntax.class14;

import java.util.Scanner;

public class TaskClass {

	public static void main(String[] args) {
		
	/*1. Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
2. Password should be minimum 8 characters, if less → message=“Password is too short”.
3. Password cannot contain username if so, → message=“Password cannot contain username”.
4. Password should match confirmed password, if not  → message=“Passwords do not match”.
 Only after all requirements met → message “Your username and password has been created” 
	 * 	
	 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your Username");
		String user = scan.nextLine();
		
		System.out.println("Enter your Password");
		String password = scan.nextLine();
		
		System.out.println("Confirm Password");
		String password2 = scan.nextLine();
		
	     if (user.isEmpty() || password.isEmpty()) {
	    	 System.out.println("Username and Password cannot be empty");
	     }else if (password.length()<8) {
	    	 System.out.println("Password is too short");
	     }else if(password.contains(user)) {
	    	 System.out.println("Password cannot contain username");
	     }else if(!password.contentEquals(password2)) {
	    	 System.out.println("Passwords do not match");
	     }else {
	    	 System.out.println("Your username and password has been created”); ");
	     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
