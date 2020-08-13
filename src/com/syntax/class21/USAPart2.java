package com.syntax.class21;

public class USAPart2 {
	public static String  country;
	String state;
	String capital;


	USAPart2(String state, String capital){
		this.state=state;
		this.capital = capital;
	}
		
	void displayState() {
		System.out.println("state is = "+state);
	}	
	void dispalyCapital() {
		System.out.println("capital is =" +capital);
	}	
	
	void displayInfo() {
		displayState();//this.displayState() Compiler adds this to reffer 
		dispalyCapital();//this.displayCapital(); compiler adds implicitly
		
	}
		
}
