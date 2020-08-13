package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HWBuilding {

	public static void main(String[] args) {
		//1. Create a map of a building. Store floor number and it is associated company name. 
		//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
		
		Map<Integer,String> building = new LinkedHashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Hulu");
		building.put(5, "Netflix");
		building.put(6, "Google");
		building.put(6, "Google");
		building.put(7, "Google");
		
		//* Check how many entries you have?
		System.out.println(building.size());
		
		//* Update company on a 4th floor 
		building.put(4, "AppleTV");
		System.out.println(building);
		
		//* Remove company on the 7th floor	
		building.remove(7);
		System.out.println(building);
		
		//* Print your map
		Set<Integer> keys = building.keySet();
		
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			int key = it.next();
			System.out.println(key + " value of "+ building.get(key));
		}
		
		
		
		
		
	}

}
