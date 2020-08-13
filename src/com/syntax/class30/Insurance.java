package com.syntax.class30;

public abstract class Insurance {
	//1. Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour 
	//as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. 
	//Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
	//Create 3 objects of the sub classes and store them in ArrayList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class. 
	
	public String insuranceName;
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	
	public abstract void getQuote();
	
	public abstract void cancellInsurance();
}

class Car extends Insurance{
	
	public String carModel;
	
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	
	public void getQuote() {
       System.out.println("Best price for "+ carModel+ " in our Insurance "+ insuranceName);
	
}
	public void cancellInsurance() {
		System.out.println("You can cancell your insurance in "+ insuranceName);
	}
}


class Pet extends Insurance{
    public String petType ;
	
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}
	
	public void getQuote() {
       System.out.println("Best price for your "+ petType+ " in our Insurance "+ insuranceName);
	
}
	public void cancellInsurance() {
		System.out.println("You can cancell your insurance in "+ insuranceName);
	}
}
	



class Health extends Insurance{
	public Health(String insuranceName) {
		super(insuranceName);
	}
	
	public void getQuote() {
       System.out.println("Best price in our Insurance "+ insuranceName);
	
}
	public void cancellInsurance() {
		System.out.println("You can cancell your insurance in "+ insuranceName);
	}
	
}