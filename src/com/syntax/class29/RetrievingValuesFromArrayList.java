package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrievingValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> name =new ArrayList<>();
		name.add("Klaus");
		name.add("Elsa");
		name.add("Olivia");
		name.add("Amaliya");
		name.add("Elena");
		
		//to retrieve a value
		String str = name.get(3);
		System.out.println(str);
		
		System.out.println("-------Retrieving values from ArrayList using enhanced for loop-------");
		//how to retrieve a value 1 by 1
		
		for(String names : name) {
			System.out.println(names);
			if (names.equals("Olivia")) {
				System.out.println("Olivia you are awesome");
			}
		}
		System.out.println("-------Retrieving values from ArrayList using for loop-------");
		
		for (int i = 0; i<name.size(); i++) {
			String s =name.get(i);
			System.out.println(s);
		}
		
		Iterator <String> it = name.iterator();
		
		
		
		
		
	}

}
