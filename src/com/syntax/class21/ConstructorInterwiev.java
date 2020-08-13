package com.syntax.class21;

public class ConstructorInterwiev {
	
	
	
	
	ConstructorInterwiev(){
		this(1);
		System.out.println("Hi");
	}
	
	ConstructorInterwiev(int x){
		this(1, 2);
		System.out.println("Hello");
	}
	ConstructorInterwiev(int x, int y){
		
		System.out.println("How are you");
	}
	
	
	
	public static void main(String[] args) {
		
      ConstructorInterwiev obj = new ConstructorInterwiev();
      
	}

}
