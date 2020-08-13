package com.syntax.class21;

public class AnimalsTest {

	public static void main(String[] args) {
		//object of parents class has an access to all var and methods of it 
		//is Parent and is own class 
		
		Animals a = new Animals();
		a.breed="Some";
		a.color = "grey";
		a.paws = 4;
		a.sleep();
		a.eat();
		
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color= "Yellow";
		dog.paws = 4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed="MAikun";
		cat.color= "gray";
		cat.paws = 4;
		cat.tail=true;
		
		cat.eat();
		cat.sleep();
		cat.purr();
		
		Kitten kitten = new Kitten();
		kitten.breed="British";
		kitten.color = "red";
		kitten.age ="2 weeks";
		
		kitten.cry();
		kitten.play();
			
		
		
		
		
		
	}
}
