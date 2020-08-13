package com.syntax.class27;

public class MotorcycleTest {

	public static void main(String[] args) {
		
		//new Drivable(); CE cannot instantiate
		//new Motorcycle(); CE cannot instantiate
		System.out.println("-----obj of Motorcycle type---------");
		
		Motorcycle n = new Bike();
		n.driving();
		n.breaking();
		n.operateVehicle();
		System.out.println(Motorcycle.DRIVE);
		
		System.out.println("------obj of Drivable type---------");
		
		Drivable d = new Bike();
		d.driving();
		d.breaking();
	
		System.out.println(Drivable.DRIVE);
		
		System.out.println("------obj of Bike type---------");
		
		Bike o = new Bike();
		o.breaking();
		o.operateVehicle();
		o.driving();
		
		Vehicle v = new Bike();
		v.operateVehicle();

	}

}
