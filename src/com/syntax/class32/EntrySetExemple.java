package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class EntrySetExemple {

	public static void main(String[] args) {
		
		Map<Integer,String> building = new LinkedHashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Hulu");
		building.put(5, "Netflix");
		building.put(6, "Google");
		building.put(6, "Google");
		building.put(7, "Google");
		
		System.out.println("Building map"+ building);
		
		System.out.println("      Retrieving key and value pair from Entry using for loop");	
		
		Set<Entry<Integer, String>> entries = building.entrySet();
		System.out.println("Set of Entry objects: "+ entries);
		
		for(Entry<Integer, String> ent : entries) {
			System.out.println(ent.getKey()+ "----"+ ent.getValue());
		}
		
		System.out.println("      Retrieving key and value pair from Entry using iterator");
		
		Iterator<Entry<Integer, String>> it = entries.iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}
		
	}

}
