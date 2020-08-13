package com.syntax.teamTasks;

public class Car {
	double carPrice;
	String color;
	
	Car(double carPrice, String color){
		this.carPrice=carPrice;
		this.color =color;
	}
	
	public double calculateSalePrice() {
		return carPrice;
	}
}

class Sedan extends Car{
	
	double length;
	
	Sedan(double carPrice, String color, double length){
		super(carPrice,color);
		this.length =length;
	}
	
	public double calculateSalePrice() {
		if(length>20) {
		return carPrice*0.05;
		}else {
			return carPrice*0.1;
		}
	}
}

class Truck extends Car{
	
	double weight;

	Truck(double carPrice, String color, double weight){
		super(carPrice,color);
		this.weight =weight;
	}
	
	public double calculateSalePrice() {
		if(weight>2000) {
		return carPrice*0.1;
		}else {
			return carPrice*0.2;
		}
	}
	
	
}