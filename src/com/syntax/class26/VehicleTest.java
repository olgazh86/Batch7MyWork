package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle lambo = new Lamborgini("5355663");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.total();
		System.out.println(total);
		
		System.out.println("---------------------------------------");
		
		Car car = new Lamborgini("436366BGNN");
		
		car.drive();
		car.openTrunk();
		car.start();
        car.stop();
        
        total = Car.total();
        System.out.println(total);
        
        
	}

}
