package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CitiesHW {

	public static void main(String[] args) {
		
		//Create a Map from array of cities that will sort keys in alphabetical order. 
		//As a key store the name of the city and as a value store the length of the city
		//(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
		//If any city name is more than 7 characters remove that city .
		
		
		Map<String, Integer> cities = new TreeMap<>();
		
		cities.put("Paris",5);
		cities.put("Moscow", 6);
		cities.put("Minsk",5);
		cities.put("Boston", 6);
		cities.put("Alexandria",10);
		
		
   //System.out.println(cities);
   
   Set<String> keys = cities.keySet();
   
  Iterator<String> it = keys.iterator();
  
  while(it.hasNext()) {
	  String str = it.next();
	  if(str.length()>7) {
		  it.remove();  
	  }
	
  }
  System.out.println("Cities length less then 7 "+ cities);
   
   
   
   


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
