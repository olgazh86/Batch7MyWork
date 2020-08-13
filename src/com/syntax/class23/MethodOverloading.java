package com.syntax.class23;

public class MethodOverloading {
      
	//1. by changing number of parameters
	public int sum(int num1, int num2) {//<-----header and sum(int num1, int num2)-->signature
		return num1+num2;
	}
	//same method name-->different parameters 
	public int sum(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	
	//2.way by changing type of parameters
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	public double sum(double num1, double num2, double num3) {
		return num1+num2+num3;
		
	}
	
	// we cannot overload method by chenging return type ONLY
	
	
	
	
	
	
}
