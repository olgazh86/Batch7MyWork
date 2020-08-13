package com.syntax.class21;

public class ThisKeyword {
	
	int a, b;
	
	 ThisKeyword() {
		System.out.println("I am a constructor that you do not reall need");
	}

	ThisKeyword(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	//checks sum of local variables 
	void sum(int a, int b) {
		System.out.println(a+b);
		//to get sum of instance variable
		System.out.println(this.a+this.b);
	}
	
}
