package com.syntax.class20;

public class USA {
//diffine 2 variables for state and capital and have a constructor to initialize it
	
	public static String  country;
	String state;
	String capital;


	USA(String state, String usaCapital){
		this.state=state;//if you want use same variable name
		capital = usaCapital;//capital = capital-->null
	}
		
	public void dispaly() {
		System.out.println("State is " + state + "and it is capital is"+ capital);
	}
	
}
