package com.syntax.class14;

public class StringDifference {

	public static void main(String[] args) {
		
		String name="Madeeha";
		String name1= new String();
		name1="Madeeha";
		
		System.out.println(name);
		System.out.println(name1);
		
		if (name.equals(name1)) {
			System.out.println("String are equal using equals method");
		}
		
		if (name==name1) {// not work 
			System.out.println("String are equal using == operator");
		}
		
		
		
		
		
		
	}

}
