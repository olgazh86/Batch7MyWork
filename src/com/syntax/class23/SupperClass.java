package com.syntax.class23;

public class SupperClass {

	String name ="Kamila";
	
	public void printHello() {
		System.out.println("Hello from parent class");
	}
	
}
class SubClass extends SupperClass{
	
	String name ="Mina";
	
	
	public void displayName() {
		System.out.println(name);//this.name for access SubClass String name 
		//System.out.println(super.name);//if same "name" call the parent class 
	}
	
	public void printHello() {
		System.out.println("Hello from child class");
	}
	public void callingParentMethod() {
		printHello();//---> print this.printHello add.autom this.printHello();
		super.printHello();//compiler add automat.----> super.printHello();
	}
}