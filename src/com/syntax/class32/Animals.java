package com.syntax.class32;

public abstract class Animals {
	
	protected String type;
	protected String color;
	
	public Animals(String type, String color){
		this.type = type;
		this.color=color;
	}
	abstract void eat();
	
	abstract void sleep();
}
class Dog extends Animals{
	
	Dog(String type, String color){
		super(type, color);
	}
	public void eat() {
		 System.out.println(type+ " eats bones");
	 }
	public void sleep() {
		System.out.println(type + " sleeps at home");
	}
}

class Zebra extends Animals{
	
	Zebra(String type, String color){
		super(type, color);
	}
	protected void eat() {
		 System.out.println(type+ " eats grass");
	 }
	protected void sleep() {
		System.out.println(type + " sleeps");
	}
}

class Monkey extends Animals{
	
	Monkey(String type, String color){
		super(type, color);
	}
	public void eat() {
		 System.out.println(type+ " eats banannas");
	 }
	public void sleep() {
		System.out.println(type + " sleeps");
	}
}