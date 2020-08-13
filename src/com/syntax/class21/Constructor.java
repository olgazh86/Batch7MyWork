package com.syntax.class21;

public class Constructor {
   
	
	String word;
	
	public Constructor() {
		System.out.println("I am non argument constructor");
	}
	
	public Constructor(String word){
		this(12, word);//ALWAYS MUST be a 1 statement inside the constructor
		this.word=word;
		System.out.println("I am a parameterized constructor with str ="+word);
	}
	public Constructor(int num){
		System.out.println("I am constructor with 1 parameter ="+num);
	}
	public Constructor(int num, String word){
		System.out.println("I am constructor with 2 parameters ="+num+ "and"+word);
	}
	
	//Constructor(int b){
	//	System.out.println("I am constructor with 1 parameter ="+num);
	//} CE we cannot have duplicate constructors
	
	
	
	public static void main(String[] args) {
		
		Constructor obj =new Constructor("Java");
         System.out.println(obj.word);
	}

}
