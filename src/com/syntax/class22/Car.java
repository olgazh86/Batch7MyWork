package com.syntax.class22;

public class Car {
	String make;
	public Car(String make) {
		this.make=make;
	}

}
class Tesla extends Car{
	
	boolean autopilot;
       
	Tesla(String make, boolean autopilot){
		 super(make);
		 this.autopilot= autopilot;
	}
	
	void info() {
		System.out.println("We build "+ make+ " that has autopilot feature =" +autopilot);
	}
	
	
	
}