package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsfromCollection {

	public static void main(String[] args) {
		// create an arrayList of city names

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Kyiv");
		cities.add("LA");
		cities.add("Istambul");
		cities.add("LA");
		cities.add("DC");
		cities.add("New York");

		System.out.println(cities);

		// remove cities LA, DC

		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
			}
		}
		System.out.println(cities);

		
	System.out.println("------removing obj from ArrayList using enhanced loop-------");
	//	for (String city : cities) {
	//		if (city.equals("Kyiv")) {
	//			cities.remove(city);
	//		}
	//	}
	//	System.out.println(cities);//CE 
	
	
	cities.add("LA");
	cities.add("Miami");
	cities.add("Miami");
	cities.add("Miami");
	cities.add("Miami");
			System.out.println("Collection befor using iterator " + cities);
			
			Iterator <String> citiesIT = cities.iterator();
			//remove New York and LA obj 
			
			while (citiesIT.hasNext()) {
				String ci = citiesIT.next();//store your next obj 
				if (ci.equals("LA") || ci.equals("Miami")) {
                      citiesIT.remove();
			}
			}
	System.out.println("ArrayLIst after modification from Iterator: "+ cities);
	
	
	}
}
