package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HWBestBuy {

	public static void main(String[] args) {
		
		//1. Create a map of Best Buy store. Place
		//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		// Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer,String> store = new TreeMap<>();
		store.put(7664843,"Printer");
		store.put(7623763,"TV");
		store.put(7567987,"Coffee Maker");
		store.put(4689322,"DVD");
		store.put(8761234,"Vacuume cleaner");
		store.put(3245891,"Phone");
		
		System.out.println(store);
		
		System.out.println("------Retrieve all keys and values from a Best Buy map using EntrySet-------");
		
		Set<Entry<Integer,String>> stors =store.entrySet();
	
		System.out.println("---Using for loop---------");
		for(Entry<Integer,String> setStor: stors) {
			System.out.println(setStor.getKey()+ " "+ setStor.getValue());
		}
		//2
		System.out.println("-----Using Iterator----------");
		
		Iterator<Entry<Integer, String>> itStore = stors.iterator();
		while(itStore.hasNext()) {
			Entry<Integer,String> entryStore = itStore.next();
			System.out.println(entryStore.getKey()+" & "+ entryStore.getValue());
		}

	}

}
