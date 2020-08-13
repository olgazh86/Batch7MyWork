package com.syntax.class30;

public abstract class Card {
	
	String type;
	
	public Card(String type) {
		this.type=type;
	}
	public void getPoints() {
		System.out.println("After spending $2000.00 you can get points from "+ type);
	}
	
	public abstract void getCash();

}


class Visa extends Card{
	
	public Visa(String type) {
		super(type);
	}
	
	public void getCash() {
		System.out.println("You can get cash with "+ type);
	}
}

class MasterCard extends Card{
	
	public MasterCard(String type) {
		super(type);
	}
	
	public void getCash() {
		System.out.println("You can't have a cash with credit card: "+ type);
	}
}

class Amex extends Card{
	
	public Amex(String type) {
		super(type);
	}
	
	public void getCash() {
		System.out.println("You can have cash "+ type);
	}
}