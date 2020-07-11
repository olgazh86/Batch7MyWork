package com.syntax.class19;

public class Employee {
	
	 public static String company;// any class from any package in the project 
	
	public String name, lastName;// any class from any package in the project
	protected int age;// if class within sme package it can access all protected members
	double salary;// default // if class within sme package it can access all protected members
	private long ssn;// only it is own class/same can have an access to private members
	
	
	
	public static void displayCompany() {
		System.out.println("Employee works at "+ company);
	}

	public void displayName() {
		System.out.println("Emploeey name is "+ name+ " " + lastName);
	}
	protected void dispaleyAge() {
		System.out.println("Emploeey is "+ age+ "years old");
	}
	
	void displaySalary () {
		System.out.println("Emploeey salary is "+ salary);
	}
	
	private void displaySsn() {
		System.out.println("Emploeyy ssn is "+ ssn);
	}
	
	public static void main(String[] args) {
		
		company = "Google";
		
		Employee emp =new Employee();
		emp.name="Ahmet";
		emp.lastName= "Smith";
		emp.age=21;
		emp.salary=90000;
		emp.ssn=1234567;
		
		emp.displayName();
		emp.dispaleyAge();
		emp.displaySalary();
		emp.displaySsn();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
