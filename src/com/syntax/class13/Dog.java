package com.syntax.class13;

public class Dog {
	
	String breed;
	String group;
	String activLevel;
	String coatType;
	
	public static void main(String[] args) {
		Dog breeds = new Dog();
		breeds.breed="Husky";
		breeds.group="Working group";
		breeds.activLevel="Active";
		breeds.coatType="Medium";
		System.out.println("The breed is "+ breeds.breed+ " it's belong to "+ breeds.group+ ". "+ "Activity Level is "+ breeds.activLevel+". "+"The dog coat type is "+breeds.coatType);
		breeds.play();
		breeds.training();
		breeds.health();
		
		System.out.println("----------------------------------------------------");
	
		Dog breeds2 = new Dog();
		breeds2.breed="Bulldog";
		breeds2.group="Non-Sporting group";
		breeds2.activLevel="Non-active";
		breeds2.coatType="Short";
		System.out.println("The breed is "+ breeds2.breed+ " it's belong to "+ breeds2.group+ ". "+ "Activity Level is "+ breeds2.activLevel+". "+"The dog coat type is "+breeds2.coatType);
		breeds2.play();
		breeds2.training();
		breeds2.health();
		

		
		System.out.println("----------------------------------------------------");
	
		
		Dog breeds3 = new Dog();
		breeds3.breed="Labrador Retriever";
		breeds3.group="Sporting group";
		breeds3.activLevel="Very Active";
		breeds3.coatType="Medium";
		System.out.println("The breed is "+ breeds3.breed+ " it's belong to "+ breeds3.group+ ". "+ "Activity Level is "+ breeds3.activLevel+". "+"The dog coat type is "+breeds3.coatType);
		breeds3.play();
		breeds3.training();
		breeds3.health();
	
		
	}
	
	
	void play() {
		System.out.println(breed + " love to play with other family members");
	}
    void training() {
    	System.out.println(breed+ " training is highly recommended");
    }
    void health() {
    	System.out.println(breed+ " highly recommended for stress relief :)");
    }
}
