package com.syntax.class18;

public class InstanceVariables {

	String name ="Yuriy";//instance variable 
	
	
	public static void main(String[] args) {
		String name = "Kristina";//local variable
		System.out.println(name);

		//we create an Object or we instanciate a class---->InstanceVariables
	
		InstanceVariables obj = new InstanceVariables();
		obj.name="Jane";
		System.out.println(obj.name);
		
	//change value from Kristina to Castro	
		name = "Castro";
		System.out.println("New value of the local variable " + name);
		
	// change 	Jane to Ed ----->change value of the instance variable 
		obj.name="Ed";
		System.out.println("New value of instance variable " + obj.name);
		
		
		System.out.println("Printing value name using 2nd instance");
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
		
	}

}
