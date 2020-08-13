package com.syntax.class23;

public class ShapeClass {
	//1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
	//In circle class create a method to calculate the area of circle. Test your code
	
	double radius;
	
	public ShapeClass(double radius) {
		this.radius=radius;
	}

}

class CircleClass extends ShapeClass{
	
	public CircleClass(double radius) {
		super(radius);
	}
	
	public void display() {
		double result;
		result  = 3.14*radius*radius;
		System.out.println(result);
	
	}
	
	
}