package com.syntax.class23;

public class TestingSuper {

	public static void main(String[] args) {
		
	
	SubClass obj = new SubClass();
	obj.displayName();
	obj.callingParentMethod();
	
	System.out.println("-----Object of the parants------");
	SupperClass obj1 = new SupperClass();
	obj1.printHello();
	
	
	}
}
