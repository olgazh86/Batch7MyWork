package com.syntax.class20;

public class Flower {
	
	String type;
	//Flower(){}//defoult non argument
	//if you are not going to create a constructor -->compiler WILL create 1 for you 
	
	//Flower(){
	// System.out.println('I am pointless constructor");
	//} 
	Flower(String flowerType){
		type=flowerType;
	}
	public void display() {
		System.out.println(type);
	}
	void Flower() {
		System.out.println("Printing");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//Flower flower = new Flower();
		//System.out.println(flower.type);
		
		Flower flower2 = new Flower("Tulip");
		flower2.display();
		flower2.Flower();
		
	}
	

}
