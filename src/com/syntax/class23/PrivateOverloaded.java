package com.syntax.class23;

public class PrivateOverloaded {
	//1. Create 1 class with a private method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	private void overDyspaly() {
		System.out.println("Empty parameters");
	}
	private void overDyspaly(String name) {
		System.out.println("Empty parameters with 1 parametre: "+ name);
	}
	private void overDyspaly(String name, String batch) {
		System.out.println("Empty parameters with 2 parameters: "+ name+ batch);
	}
	
	public static void main(String[] args) {
		
		
		PrivateOverloaded obj = new PrivateOverloaded();// Private not visible 
		obj.overDyspaly();
		obj.overDyspaly("Syntax");
		obj.overDyspaly("Syntax" ,"Batch 7");
		
		
		
		


}

}
