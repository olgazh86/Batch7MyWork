package com.syntax.class28;

public class Employee {
	
	//Encapsulation : 1. make variable as private
	private double salary;
	private int age, empId;
	public String fullName, title;
	
	//2. create public methods (getters and setters) to give access to private varisbles
	
	//creating getters
	public double getSalary() {
		return salary;
	}
	 public int getAge() {
		 return age;
	 }
	 public int getEmpId() {
		 return empId;
	 }
	 //constructor
	// public Employee(String fullName,String title) {
		// this.fullName = fullName;
		// this.title = title;
	// }
     
	 //creating setters
	 public void setSalary(double salary) {
		 this.salary=salary;
	 }
	 
	 public void setAge(int age) {
		 if (age>16) {
		 this.age = age;
		 }
	 }
	 
	 public void setEmpId(int empId) {
		 if (empId>0) {
			 this.empId=empId;
		 }
	 }
	 
}
