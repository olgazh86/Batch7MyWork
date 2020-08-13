package com.syntax.class29;

import java.util.ArrayList;

public class ArrayTask {

	public static void main(String[] args) {
		//Create an ArrayList that will store 5 names into it. 
		//Find out whether the given ArrayList is empty or not? 
		//Check whether the specific name is present in an ArrayList or not?
		//Find the size of your arrayList and print all values from that
		
		
		//generic collection
	ArrayList <String> name =new ArrayList<>();
	name.add("Klaus");
	name.add("Elsa");
	name.add("Olivia");
	name.add("Amaliya");
	name.add("Elena");
	System.out.println("ArrayList is empty: "+ name.isEmpty());
	
	System.out.println("ArrayList contains name Olivia: " + name.contains("Olivia"));
	System.out.println("ArrayList size = " + name.size());
	System.out.println(name);
	
	

	
	//before java1.5 collections was not Generic
	
	//non generic collection
	ArrayList alist = new ArrayList();
	
	alist.add("String");
	alist.add(100);
	alist.add(10.99);
	alist.add('c');
	
	System.out.println("NON GENERIC ArrayList collection " + alist);
}
}