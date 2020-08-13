package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		
            HashMap <Integer,String> hmap = new HashMap<>();
            //storing objects inside map as a Key and Value Pair
            
            hmap.put(10, "John");//K+V=Entry
            hmap.put(11, "Jane");
            hmap.put(12, "James");
            System.out.println(hmap);
            // cannot have duplicat Keys
            hmap.put(12, "Gozde");//no duplicate, but can update 
            hmap.put(13, "Olga");
            //can have duplicate Value
            hmap.put(1,"Olga");
            System.out.println(hmap);
            
        //how many entry obj inside the map?  
         int entryObj = hmap.size();
        System.out.println(entryObj);
               
        //how to check in map has any elements?
        boolean isEmpty = hmap.isEmpty();
        System.out.println(isEmpty);
               
        //check if map have specific key or value/
        boolean hasKey =  hmap.containsKey(12);
        System.out.println("Map contains key obj 12 = "+ hasKey);
        boolean hasValue = hmap.containsValue("John");
        System.out.println("Map contains value obj John = "+ hasValue);
        
        //how to retrieve 1 value from the MAp
        String value = hmap.get(13);
        System.out.println("Get value from key 13 = "+ value);
        
        //how to remove a key from map        
        hmap.remove(10);
        System.out.println(hmap);
        
         
	}

}
