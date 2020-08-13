package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {
		
		Bird bird=new BabyBird();//it's upcasting-->obj of subclass is reffered by a Superclass
		
		
		//achiving runtime polymorphism 
		bird.fly();//execute -->"Baby bird can fly after few month"
		bird.eat();
		bird.sleep();
		//bird.cry(); not available
		//during compilation compiler gives an access based o refernts on the parents 

	}

}
