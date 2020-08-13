package com.syntax.teamTasks;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration reg = new Registration();
		reg.setEmail("get@yahoo.com");
		System.out.println(reg.getEmail());
		
		reg.setUserName("Syntax");
		System.out.println(reg.getUserName());
		
		reg.setPassword("12345Syntax");
		System.out.println(reg.getPassword());
		
	}

}
