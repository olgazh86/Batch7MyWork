package com.syntax.class20;

public class TestClassStudents {

	public static void main(String[] args) {
		ClassStudents student1 = new ClassStudents("Smith", 70, 80, 83);
		ClassStudents student2 = new ClassStudents("Adam", 49, 23, 94);
		ClassStudents student3 = new ClassStudents("Lucy", 98, 53, 45);
		ClassStudents student4 = new ClassStudents("Mary", 78, 15, 0);
		ClassStudents student5 = new ClassStudents("Ahmet", 67, 89, 99);
		
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		student5.displayInfo();

	}

}
