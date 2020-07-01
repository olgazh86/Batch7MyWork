package com.syntax.class16;

public class DifferentMethods {
//1. method that says hello 10 times or any number of time 
	
	void sayHello(int times) {
		for (int i=0; i<times;i++) {
			System.out.println("Hello");
		}
		
	}
	public static void main(String[] args) {
		//1
		DifferentMethods obj = new DifferentMethods();
		obj.sayHello(5);
//////////////////////////////////////////////////		///////
		
		//2.
		obj.printAnyWord("I love you", 3);
//////////////////////////////////////////////////////////		
		
		//3.
		obj.isHungry(true);
		
		
	}
	
	// 2.create that will print any word any number of time 
	
	
	void printAnyWord(String word, int times) {
		
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	//3. create method isHungry that will accept boolean value and print 
	// if true ---> go cook, go to study 
	
	void isHungry(boolean areYouHungry) {
		if (areYouHungry) {
			System.out.println("Please cook for your self");
		}else {
			System.out.println("Go ahead and study");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
