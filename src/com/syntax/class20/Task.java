package com.syntax.class20;

public class Task {
	
	String name;
	int age;
	
	void printTask() {
		System.out.println("Name is " + name+ " and age is "+ age);
	}
		
 Task(String TaskName, int TaskAge){
	 name= TaskName;
	 age = TaskAge;
 }
 
 Task(){
	 System.out.println("I am non argument constructor");
 }

 
 
}
