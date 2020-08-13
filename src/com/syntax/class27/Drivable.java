package com.syntax.class27;

public interface Drivable {//interface is collection of public 
	//abstract methods and public static final variables(its constances veriable< not change upper case, need assign)
	
     String DRIVE= "Drive safe";//public static final add to variable by default
	
	public abstract void driving();//if not have this part public abstract
	//compiler add by default
	
	void breaking();
}

abstract class Motorcycle extends Vehicle implements Drivable{
	
public void driving() {
		System.out.println("Motorcycle is driving");
	}
}

class Bike extends Motorcycle{
	
	public void breaking() {
		System.out.println("Bikes can break");
		
	}
}

class Vehicle{
	public void operateVehicle() {
		System.out.println("To operate any vehicle we need to have driver licens");
	}
}
