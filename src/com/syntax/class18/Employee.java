package com.syntax.class18;

import javax.swing.border.EmptyBorder;

public class Employee {
	
	//1. Create a Class called Employee:
	// Create three  variables  eID , salary and set the CEO to “Sumair” 
	//Create two objects of the class Employee 
	//Set the value of eID, salary for each of the objects
	//Print out the eID , salary and  CEO for each of the objects

	
	
	int ID;
	int salary;
	static String CEO="Sumair";
	
	void value() {
		System.out.println("CEO name is "+ CEO + " his ID number is "+ ID + " and salary is $"+ salary);
	}

	public static void main(String[] args) {
		
		Employee name1 = new Employee();
		name1.ID=2345678;
		name1.salary= 200000;
		name1.value();
			
		Employee name2 = new Employee();
		name2.ID= 675889;
		name2.salary=5566;
		name2.value();
		
		
		//accesing static method
		
		sayHelloToCeo();
	}
	
 static void sayHelloToCeo() {
	 System.out.println("Hi "+ CEO);
 }

}
