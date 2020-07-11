package com.syntax.class18;

public class LocalVeriable {

	public static void main(String[] args) {
		
		String name ="Mohammad";// local to main method and its scope only within main method
		for (int i=0; i<=5; i++) {
			System.out.println(i);
		}
		//System.out.println(i); CE i cannot be resolved to a variable
	}

	
	void displayName() {
		//System.out.println(name); CE name cannot be resolved to a variable
		                            //name is not visible 
	}
	
	//create a method to return 2 numbers 
	
	int sum (int num1, int num2) {//num1 num2 local variables to method sum
		return num1+num2;
	}
	
	double div (double num1, double num2) {//num1 num2 local variables to method div
		return num1/num2;
	}
	
	
	
	
	
	
	
}
