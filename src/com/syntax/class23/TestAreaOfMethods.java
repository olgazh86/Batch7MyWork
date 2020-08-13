package com.syntax.class23;

public class TestAreaOfMethods {

	public static void main(String[] args) {
		
		AreaOfMethods obj = new AreaOfMethods();
		System.out.println("Area of rectangle = "+ obj.area(10,5));
		System.out.println("Area of square = "+ obj.area(5));
		System.out.println("Area of box = "+obj.area(12,5, 4));
	}

}
