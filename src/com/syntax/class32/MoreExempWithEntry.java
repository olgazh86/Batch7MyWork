package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreExempWithEntry {

	public static void main(String[] args) {
		
		Map<String, String> movies = new TreeMap<>();
		//save data
		movies.put("Comedy","Movie 43");
		movies.put("horror", "Bird box");
		movies.put("Fiction", "Avengers");
		movies.put("Action", "James Bond");
		movies.put("Romance", "Titanic");
		
		System.out.println(movies);
		
		//retriev data
	Set <Entry<String, String>> allEntry=movies.entrySet();	
	
	
		Iterator <Entry<String, String>> iterate = allEntry.iterator();
		while(iterate.hasNext()) {
			Entry<String, String> ent = iterate.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println(key+ " ---"+ value);
		}
		System.out.println("----------------------");
		
		for (Entry<String, String> entry: allEntry) {
			String pair = entry.getKey()+ " && "+ entry.getValue();
			System.out.println(pair);
		}

	}

}
