package com.syntax.class21;

public class StudentTask {
	
	String name;
	String adress;
	
	public StudentTask( String name, String adress) {
		this.name= name;
		this.adress = adress;
	}
	
	void displayInfo() {
		System.out.println(("Name is "+ name +" and "+ " Adress is "+ adress));
	}

	public static void main(String[] args) {
		StudentTask obj = new StudentTask("Klaus", "Tampa FL");
		obj.displayInfo();
	
		
	}

}
