package com.syntax.class23;

public class ConstractorOverloading {
	//1 constructor
	public ConstractorOverloading() {
		System.out.println("Non argument constractor");
	}
	//2 constr-r --> name  ---->diff parameters
	public ConstractorOverloading(String str) {
		
	}
	//3    same name     -->diff parameters
	ConstractorOverloading(String str, String str1){
		
	}
	//4                --->diff parameters
	ConstractorOverloading(int num){
		
	}
	
}
