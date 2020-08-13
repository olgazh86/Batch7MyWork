package com.syntax.class23;

public class StaticOverloaded {
	
	//1. Create 1 class with a static method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	
	
	static void overDyspaly() {
		System.out.println("Empty parameters");
	}
	static void overDyspaly(String name) {
		System.out.println("Empty parameters with 1 parametre: "+ name);
	}
	static void overDyspaly(String name, String batch) {
		System.out.println("Empty parameters with 2 parameters: "+ name+ batch);
	}
	
	public static void main(String[] args) {
		
		overDyspaly();
		overDyspaly("Syntax");
		overDyspaly("Syntax","Batch 7");
		
		
		
		
		
		
	}
	


}
