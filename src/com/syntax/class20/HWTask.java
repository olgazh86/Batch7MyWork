package com.syntax.class20;

public class HWTask {
//rite a program  that will have 4 different access levels of constructors and create 3 objects of this class:
	//1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
	
	
	String name;
	int age;
	double num;
	char chr;
	
	public void print() {
		System.out.println(name+ " "+ age+" "+ num+ " "+ chr);
	}
	
	//default 
	
	HWTask(String nameTask){
		name=nameTask;
	}
	
	//public
	public HWTask(int ageTask) {
		age=ageTask;
	}
	//protected
	
	protected HWTask(double numTask) {
		num=numTask;
	}
	//private
	
	private HWTask(char chrTask) {
		chr = chrTask;
	}
	
	
	//printing inside same class
	
	public static void main(String[] args) {
		
		HWTask obj1 = new HWTask("Klaus");
		obj1.print();
		
		HWTask obj2 = new HWTask(1);
		obj2.print();
		
		HWTask obj3 = new HWTask(1.2);
		obj3.print();
		
		HWTask obj4 = new HWTask('K');
		obj4.print();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
