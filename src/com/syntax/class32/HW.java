package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {

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
				
				
				   System.out.println("-----------"); 
				   
				   
				//* Print your map
				Set<Integer> keys = building.keySet();//<--return collection all keys
				
				Iterator<Integer> it = keys.iterator();
				while (it.hasNext()) {
					int key = it.next();
					System.out.println(key + " value of "+ building.get(key));
				}
				
				
				   System.out.println("-----------"); 
				   
				   
				Collection <String> values = building.values();//<--convert MAp to Collection
				     //1 way                          // and retrive all value 
				for(String val:values) {//<--use enhance/advance loop for get all value 1 by 
					System.out.println(val);
				}
				
				
				   System.out.println("-----------"); 
				   
				//2 way
				for(String val:building.values()) {//<--use enhance/advance loop for get all value 1 by 1
					System.out.println(val);
				}
				
				   System.out.println("-----------"); 
				   
				               // name       map   collection   methodIterator
			Iterator<String> valueIterator=building.values().iterator();
				while(valueIterator.hasNext()) {
					System.out.println(valueIterator.next());
				}
				
				        System.out.println("-----------");      
				//map   collection   iter    str
				String something =building.values().iterator().next();
				System.out.println(something);//<----print first value or first element
				
			
				
				
			}




}
