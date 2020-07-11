package com.syntax.class20;

public class ConstroctorTypes {
	
	public ConstroctorTypes() {// non argument constructor
		System.out.println("I am a constaractor");
	}
    ConstroctorTypes(String str){//parameterized constructor
	System.out.println("I am a constructor with 1 String parameter "+str);
}
    ConstroctorTypes(int num){
    	System.out.println("I am a constructor with 1  int parameter "+ num);
    }
    ConstroctorTypes(double num){
    	System.out.println("I am a constructor with 1  int parameter "+ num);
    }
    ConstroctorTypes(String name, int age){
    	System.out.println("I am a constructor with 1  int parameter "+ name + age);
    }
	
	
	public static void main(String[] args) {
		
		ConstroctorTypes obj = new ConstroctorTypes("Aidana", 25);
		
		System.out.println("I am a code inside main method");
	}
	
	
	
	
	
	
	
	
}
