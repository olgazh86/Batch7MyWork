package com.syntax.class19;

public class AccessingEmployeeClassMembers {

	public static void main(String[] args) {
		Employee emp= new Employee();
		
		emp.lastName="Godze";
		emp.lastName = "Doe";
		emp.age=30;// accessing protected
		emp.salary = 1000000;//accessing default
		//emp.ssn---> wont be available because its private 

		emp.dispaleyAge();
		emp.displayName();
		emp.displaySalary();
		//emp.dispalySsn();--> wont be available its private
		
		
		
	}

}
