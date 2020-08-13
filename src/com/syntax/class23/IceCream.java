package com.syntax.class23;

public class IceCream {
	
String flavor, brand, color;

public IceCream(String flavor, String brand, String color) {//parent 
	this.flavor= flavor;
	this.brand= brand;
	this.color = color;
   }
}
class Gelato extends IceCream {//child
	
	public Gelato(String flavor,String brand, String color){
		super(flavor, brand, color);
	}
}

class Sorbeto extends IceCream{//child 
	double price;
	
	public Sorbeto(String flavor,String brand, String color, double price){
			super(flavor, brand, color);// call to parents class costr-r MUST be First
			this.price = price;		
	}
	
}


class MiniSorbeto extends Sorbeto{//it's grandChild
	int calories;
	public MiniSorbeto(String flavor,String brand, String color, double price, int calories) {
		super(flavor, brand, color, price);
		this.calories = calories;
	}
	
}