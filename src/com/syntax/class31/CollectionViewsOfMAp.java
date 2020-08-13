package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMAp {

	public static void main(String[] args) {
		
		
		Map <String, Double> grocery = new LinkedHashMap<>();
		grocery.put("Apple", 1.09);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 4.99);
		grocery.put("Milk", 4.40);
		
		System.out.println(grocery);
		
		double value = grocery.get("Milk");
		System.out.println(value);
		
		//how the get all the values
		Collection<Double> values = grocery.values();//this is collection of values
		
		System.out.println("-------get all values 1 by 1 using loop--------");
		
		for(Double v :values) {
			System.out.println(v);
		}
		System.out.println("-------get all values 1 by 1 using iterator--------");
		
		Iterator<Double> it = values.iterator();
		while(it.hasNext()) {
			double v= it.next();
			System.out.println(v);
		}
		
		//how to get all Keys
		Set<String> keys = grocery.keySet();
		System.out.println("-------get all values 1 by 1 using iterator--------");
		Iterator<String> k =keys.iterator();
		while(k.hasNext()) {
			String key = k.next();
			System.out.println(key);
		}
		System.out.println("-------get all values 1 by 1 using loop--------");
		
		for (String key: keys) {
			System.out.println(key);

			System.out.println("-----------to print key + pair together-----------");
			
			System.out.println(key+ " and is value is "+ grocery.get(key));
				
		}
		
	}

}
