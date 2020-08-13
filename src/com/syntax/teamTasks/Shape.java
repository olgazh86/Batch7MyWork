package com.syntax.teamTasks;
//1. Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. 
//Create 2 classes Circle & Square that implements 
//functionality defined in the Shape Interface. Test your code.

public interface Shape {
	
	 abstract void calculateArea();
	
	 abstract void calculatePerimeter();
}

  
class Circle implements Shape{
	 
	 Circle(int r){
		 this.r=r; 
	 }
	 
	 int r;
	double pi = 3.14;
	double area;
	
	public void calculateArea(){
		area = pi*r*r;
		System.out.println(area);	
	}
	
	public void calculatePerimeter() {
		System.out.println(2*pi*r);
	}
}

class Square implements Shape{
	int length;
	
	 Square(int length){
		this.length = length;
	}

	public void calculatePerimeter() {
		System.out.println(length * 4);	
	}
	
	public void calculateArea() {
		System.out.println(length * length);
	}
}