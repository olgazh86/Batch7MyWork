package com.syntax.class32;

public class PersonHW {
	
	private String name, lastName;
	private int age;
	private double salary;
	
	public String getName(String name) {
		return name;
	}
	public String getLastName(String lastName) {
		return lastName;
	}
	public int getAge(int age) {
		return age;
	}
	public double getSalary(double salary) {
		return salary;
	}
	
	

public PersonHW(String name, String lastName, int age,double salary){
	this.name = name;
	this.lastName= lastName;
	this.age = age;
	this.salary = salary;
}
public void details() {
	System.out.println("Person name and Last name is " +name+" "+ lastName+" "+ "age is "+ age+ " and salary is "+ salary);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
