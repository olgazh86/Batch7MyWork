package com.syntax.class18;

public class Students {

	String studentName;
	int studentID;
	 
	static int numberOfStudent=0;
	
	void students() {
		System.out.println("Student name is "+ studentName+ " and ID number is "+ studentID);
	}
	
	public static void main(String[] args) {
		
		Students student1 = new Students();
		
		student1.studentName= "Elsa";
		student1.studentID= 1234;
		student1.students();
		numberOfStudent++;
		
       Students student2 = new Students();
		
		student2.studentName= "Klaus";
		student2.studentID= 1235;
		student2.students();
		numberOfStudent++;
		
       Students student3 = new Students();
		
		student3.studentName= "Olivia";
		student3.studentID= 1236;
		student3.students();
		numberOfStudent++;
		
		
	System.out.println("Total number of student: "+numberOfStudent);
		
	}
	
	
	
	
	
	

	
	
}
