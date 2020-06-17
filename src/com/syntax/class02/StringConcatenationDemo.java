package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		
	//I love Castro
	String name = "Castro";	
	
	System.out.println("I love " + name);	
	
    System.out.println("I love" + " " + name);
    
    //this is not correct 
   // System.out.println("I love"   + name);
    
    //I don't want to change my variables 
    String statement = "I love";
	System.out.println(statement + " "+ name);	
	
	String car = "BMW";
	int year = 2020;
	
	
	System.out.println(name + "has a" + car + " of yaer " + year);
		
	
	//Concatenation two Strings
	
	System.out.println("BMW of year" + "2020");
	
	//Concatenation to a String with an integral
	System.out.println("BMW of year" + 2020);
	
	//Concatenation to a String with an variable of type integer
	System.out.println(car + " of year " + year);
	
	System.out.println("BMW of year" );
		

	}

}
