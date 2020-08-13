package com.syntax.class23;

public class Programming {
	//1. Create a class named ‘Programming’. While creating an object of the class, if nothing is passed to it, 
	//then the message “I love programming languages” should be printed. 
	//If some String is passed to it, then in place of “programming languages” the value variable should be printed.
	//Example, if we pass “Java”, then “I love Java” should be printed.
	
	String name;
	
	public void dysplay() {
		System.out.println("I love programming language");
	}

	public void dyspaly (String name) {
		this.name = name;
		System.out.println("I love "+name);
		
	}
	
	
	public static void main(String[] args) {
		
		Programming obj = new Programming();
		obj.dysplay();
	    obj.dyspaly("Java");
		
	}
	
	
}
