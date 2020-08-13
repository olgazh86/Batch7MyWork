package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList <String> arrayList = new ArrayList<>();
		
		//to add values to the arraylist
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		System.out.println("Original arrayList "+ arrayList);

		//how many elements inside my ArrayList
		int arrayListSize = arrayList.size();
		System.out.println(arrayListSize);
		
		//how to access elements from ArrayLis
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		//add more objects into Array
		arrayList.add("Good bye");
		arrayList.add("Thank you");
		//arrayList is grovabale 
		System.out.println(arrayList.size());
		
		//remove "Hello"
		arrayList.remove(0);
		System.out.println("size of arraylist after removing Object "+ arrayList.size());
		
		//update value"ggod bye" -->"bye"
		
		arrayList.set(2, "Bye");
		
		System.out.println("aarayList after replacing " +arrayList);
		
		
	}

}
