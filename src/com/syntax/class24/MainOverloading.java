package com.syntax.class24;

public class MainOverloading {
	
	//can overloaded main method but Java exec. only with this parameters(String[] args)
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		main("main",4);
	
	}
	
	public static void main(String str) {
		System.out.println("I am a method with String");
	}
	
	public static void main(String str, int num) {
		System.out.println("I am a method with 2 parameters");
	}

}
