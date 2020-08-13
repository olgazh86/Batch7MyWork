package com.syntax.teamTasks;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape obj = new Circle(5);
		obj.calculateArea();
		obj.calculatePerimeter();
		
		Shape obj1 = new Square(10);
		obj1.calculateArea();
		obj.calculatePerimeter();
		
		

	}

}
