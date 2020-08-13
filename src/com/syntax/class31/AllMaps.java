package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
      //create map of grocery that will hold (item : price)
		
		Map <String, Double> grocery = new HashMap<>();
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 4.99);
		grocery.put("Milk", 4.40);
		System.out.println(grocery);
		//you CAN add null keys and null values to the HashMap (only 1 null key, multiple null values)
		//grocery.put(null,null);
		
		
		//LinkedHashMap preserve isertion order of the key
		Map<String, Double> mall = new LinkedHashMap<>();
		mall.put("Colone", 99.99);
		mall.put("T-Shirt", 15.99);
		mall.put("Schoe", 99.99);
		mall.put("Soap", 9.55);
		mall.put("Tea", 3.00);
		System.out.println(mall);
		//you CAN add null keys and mult null value into LinkedHashMap
		
		
		//TreeMap
		Map<String, Double> shoppingList = new TreeMap<>();
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		System.out.println(shoppingList);
		//CAN have null VAlues but NOT have null Keys
		
		//HashTable
		Map<String, Double> htable = new Hashtable<>();
		
		htable.put("House",600000.00);
		htable.put("Car",60000.00);
		htable.put("Food", 100.00);
		System.out.println(htable);
		
		//you CAN NOT add null keys and null values to the Hashtable
				//grocery.put(null,null);

	}

}
