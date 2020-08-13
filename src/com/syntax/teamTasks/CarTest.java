package com.syntax.teamTasks;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Sedan(40000,"red", 10);
		System.out.println(car1.calculateSalePrice());
		
		Car car2 = new Truck(70000,"black",1789);
		System.out.println(car2.calculateSalePrice());

	}

}
