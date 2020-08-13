package com.syntax.class25;

public class SuperClass {
	
	
	protected static void enjoy() {
		System.out.println("I enjoy Sundays");
	}

}

class SubClass extends SuperClass{
	//execute from parent class--> it's not overriding -->call method Hidden 
	
	//@Override -->can check if overriding 
	protected static void enjoy() {
		System.out.println("I enjoy everyday");
	}
	
}