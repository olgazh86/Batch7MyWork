package com.syntax.class31;

public abstract class Insurance {
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

