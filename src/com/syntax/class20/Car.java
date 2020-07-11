package com.syntax.class20;

public class Car {
	
	public static String make;
	protected String model, color;
	private double price;
	int year, door, speed;
	
	public void displayInfo() {
		System.out.println("We build "+ year + " "+ make +" "+ model+
				"for price =$"+price);
	}
	//create our constructor
	Car(){
		System.out.println("I am a constructor. I have not return type and my name is same as class");
	}
	
	
	
    public static void main(String[] args) {
		
    	Car car = new Car();
    	/*
    	 * Car --> class name
    	 * car --> reference variable 
    	 * new --> keyword
    	 * Car(); --> calling Constructor --> block of the code that initialize the obj
    	 */
    	
    	make= "BMW";
    	car.model="M5";
    	car.year = 2021;
    	car.color="Pink";
    	car.door= 2;
    	car.speed= 200;
    	car.price = 90000;
    	
    	Car car1 = new Car();
    	car1.model="i5";
    	car1.year = 2020;
    	car1.color="Blue";
    	car1.door= 4;
    	car1.speed= 200;
    
    	car.displayInfo(); 
    	car1.displayInfo();
    	
    	//static String driver; --->local variab CANNOT BE STATIC
    	//System.out.println(driver);
	}
	
	
	
	
}
