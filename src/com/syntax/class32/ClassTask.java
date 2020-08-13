package com.syntax.class32;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ClassTask {

	public static void main(String[] args) {
		// Create a map of countries with its capital that will store
		//countries in alphabetical order.
		//Print all keys and values from a country map using for each loop and iterator.
		//Print all values from a country map using for each loop and iterator.

           TreeMap<String,String> country = new TreeMap<>();
           
           country.put("Belarus","Minsk");
           country.put("USA", "Washington DC");
           country.put("Ukraine", "Kyiv");
           country.put("Australia", "Canberra");
           
           System.out.println(country);
           System.out.println("---------------------------");
           
        Set<String> keys = country.keySet(); 
        Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " value of "+ country.get(key));
		}

		System.out.println("------------------------------");
		
		for(String val: country.values()) {
			System.out.println(val);
		}
		
	}

}
