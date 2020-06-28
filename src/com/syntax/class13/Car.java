package com.syntax.class13;

public class Car {

	//define car features
	String make;
	String model;
	String color;
	int year;
	int speed;

	
	
	public static void main(String[] args) {
		
		System.out.println("Hello, I'm code from main method");
		 Car c1=new Car();
		 c1.make="Toyota";
		 c1.model="Camry";
		 c1.year=2020;
		 c1.drive();
		 c1.transportPeople();
		
		
		
	}

	
	//define behavior in a from of methods
	void drive() {
		System.out.println(make+ " can drive");
	}
		void reverse() {
		System.out.println(make+ " can reverse");	
		}
	void transportPeople() {
		System.out.println(make+ " can transporte people");
	}	
		
	
}
