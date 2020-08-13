package com.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TAskCountries {

	public static void main(String[] args) {
		//Create a Set collection in which you need to add names of the countries.
		//In this set we want all objects to be sorted in alphabetical order.
		//Using 2 different ways retrieve all elements from set.
		
		
		TreeSet<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Belarus");
		countries.add("Poland");
		countries.add("Australia");
		
		
		System.out.println("---retrieve with advance------");
		for (String c : countries) {
			System.out.println(c);
		}
		
		System.out.println("---retrieve with Iterator------");
		
		Iterator<String> it = countries.iterator();
		
		while(it.hasNext()) {
			String count = it.next();
			System.out.println(count);
		}
		
		
		System.out.println("-----2nd Task------");
		//Create a Set of cities in which you want to make sure that insertion 
		//order is maintained. Using Iterator remove any city that 
		//starts with “A”;
		
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Austin");
		cities.add("Columbus");
		cities.add("Detroit");
		
		Iterator<String> cIterator = cities.iterator();
		
		while(cIterator.hasNext()) {
			String cit = cIterator.next();
			if (cit.startsWith("A")) {
				cIterator.remove();
			}
		}
		System.out.println(cities);
		
		
		System.out.println("----3d task--------------");
		
//		Create a Set collection that will hold Objects of Student Type.
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. 
		//Display name of each student.
		
	Map<String, Integer> student = new HashMap<String, Integer>();
	
	student.put("Klaus", 3);
	student.put("Elsa", 22);	
	student.put("Olivia",33);
	
	System.out.println(student);
	
	
	
		
		
		
		
	}

}
