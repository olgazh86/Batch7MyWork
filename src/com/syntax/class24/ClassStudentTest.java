package com.syntax.class24;

public class ClassStudentTest {

	public static void main(String[] args) {
		
		ClassStudent cs=new ClassStudent();
		cs.study();
		cs.rest();
		cs.eat();
		System.out.println("------------------------------------");
		
		ClassStudent syntax=new SyntaxStudent();
		syntax.eat();
		syntax.rest();
		syntax.study();
		System.out.println("------------------------------------");
		
		ClassStudent college = new CollegeStudent();
		college.eat();
		college.rest();
		college.study();
		
		System.out.println("------------------------------------");
		
		ClassStudent school = new SchoolStudent();
		school.eat();
		school.study();
		school.rest();
		//school.move(); CE this method not in the perant class you can execute
		
		
		
		
		
		
		
		
	}

}
