package com.syntax.class19;

public class IPhone {
	
	static String brand ="Apple";
	static String OS="iOS";
	static boolean touchScreen=true;
	
	String model;
	int memory;
	double price;
	String color;
	
	 static void displayInfo() {// static works only with static 
		System.out.println("iPhone belongs to brand "+ brand + 
				" and it has OS as" +" and all iPhones have touchescreen = "
+ touchScreen);
	}
	//static method can not access non static members/variables 
	 /*
	  *  static void displayDetails() {
		System.out.println("We build iPhone "+ model+ " with memory = "
	+ memory+ " color "+ color+ " for price "+price);
	  */
	void displayDetails() {
		System.out.println("We build iPhone "+ model+ " with memory = "
	+ memory+ " color "+ color+ " for price "+price);
	}

	
	
	
}
