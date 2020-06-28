package com.syntax.class13;

public class CarFactory {
public static void main(String[] args) {
	//building an object of the car
	Car car1 =new Car();
	
	car1.make="Tesla";
	car1.model="X";
	car1.color="Red";
	car1.year=2020;
	car1.speed=200;
	
	System.out.println(car1.make+ "and model is "+car1.model+ "and it is in " +car1.color);
	System.out.println("-----Acssesing methods from Car class using car1---------------------");
	car1.drive();
	car1.reverse();
	car1.transportPeople();
	
System.out.println("------------------");	
	
	
	
	// build an object of the car
	Car car2=new Car();
	car2.make="BMW";
	car2.model="M5";
	car2.color="blue";
	car2.year=2018;
	car2.speed=240;
	
	System.out.println("make if 2 car is " +car2.make); 	
	//class tasks
	
	Car car3=new Car();
	car3.make="Lexus";
	car3.model="LS";
	car3.color="black";
	car3.year=2019;
	car3.speed=300;
	System.out.println(car3.make+ " and model is "+car3.model+ " and it is in " +car3.color+ " color");
	car3.drive();
	car3.reverse();
	car3.transportPeople();
	
	
	
	
	Car car4=new Car();
	car4.make="Porsche";
	car4.model="M5";
	car4.color="blue";
	car4.year=2020;
	car4.speed=240;
	System.out.println(car4.make+ " and model is "+car4.model+ " and it is in " +car4.color+ " color");
	car4.drive();
	car4.reverse();
	car4.transportPeople();
	
	
	
	
	
	
	
	
	
	
}
}
