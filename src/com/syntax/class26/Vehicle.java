package com.syntax.class26;

public abstract class Vehicle {

	//inheritance variables
	String vin;
	public static int totalVehicales;
	
	//constructor
	public Vehicle(String vin) {
		this.vin= vin;
		totalVehicales++;
	} 
	//method for count vehicals
	public static int total() {
		return totalVehicales;
	}
	//methods
	public void drive() {
		System.out.println("All vehicle drives");
	}
	public void stop() {
		System.out.println("All vehicle stop by pressing break");
	}
	//abstract methods 
	public abstract void start();
	
	public abstract void openTrunk();
	
	//abstract CAN'T be static--> static cant't overwrite 
	//abstract CAN'T be final---> final means not changebale
	//abstract CAN'T be private---> private belong to class same not overwritten
}


abstract class Car extends Vehicle{
	
	//call to parents constructor
	public Car(String vin) {
		super(vin);
		System.out.println("vin number is " +vin);
	}
	//implement just one abstract method
	public void openTrunk() {
		System.out.println("All cars open trunk automaticly");
	}
}

class Lamborgini extends Car{
	//call to Car(temporary parent) constructor
	public Lamborgini(String vin) {
		super(vin);
	}
	//initial. last abstract method
	public void start() {
		System.out.println("Lamborginin start magicaly");
	}
}