package com.syntax.class25;

public class Store {
	String name, location;
	
	public Store(String name, String location) {
		this.name=name;
		this.location = location;
	}
	
	public void openHours() {
		System.out.println(name+ " Stores are open from 8 AM - 8 PM "+ location);
	}
    
	public void sell() {
		System.out.println("All Stores sale item");
	}	
}

class Macys extends Store{
	
	public Macys (String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name+ " Stores are open from 8 AM - 12 PM " + location);
	}
}

class Starbucks extends Store{
	
	public Starbucks (String name, String location) {
		super(name, location);
	}
	public void openHours() {
		System.out.println(name+ " is open everyday from 6 AM - 12 PM "+ location);
	}
	
	public void sellDrinks() {
		System.out.println(name+ " sells different type of drinks");
	} 
}

class Nike extends Store{
		String shoes;
	public Nike (String name, String location, String shoes) {
		super(name, location);
		this.shoes = shoes;
	}
	
	
}