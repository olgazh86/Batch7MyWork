package com.syntax.class25;

public class Computer {
	String name, review;
	
	public Computer(String name, String review) {
		this.name = name;
		this.review = review;
	}
   public void brands() {
	System.out.println(name + " in the list of top computers in the World");
}
}
class Apple extends Computer{
	
	public Apple(String name, String review) {
		super(name, review);
	}
	public void brands() {
		System.out.println(name + " is 4-th place in the list of top computers in the World");
	}
	public void best() {
		System.out.println("For my opinion its the best computer");
	}

}

class Lenovo extends Computer{
	public Lenovo(String name, String review) {
		super(name, review);
	}
	public void brands() {
		System.out.println(name + " is first place in the list of top computers in the World");
	}
}

class HP extends Computer{
	public HP(String name, String review) {
		super(name, review);
	}
	public void brands() {
		System.out.println(name + " is 2-d place in the list of top computers in the World");
	}
}

class Dell extends Computer{
	public Dell(String name, String review) {
		super(name, review);
	}
	public void brands() {
		System.out.println(name + " is 3-d place in the list of top computers in the World");
	}
	
}