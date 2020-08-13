package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {

	public static void main(String[] args) {

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));
		countries.add(new Afganistan("Afganistan"));
		countries.add(new Kazakhstan("Kazakhstan"));

		System.out.println("-------using regular for loop-------");
		for (int i = 0; i <= countries.size(); i++) {
			countries.get(i).election();
		}

		System.out.println("-------using inheritance for loop-------");

		for (Country c : countries) {
			c.election();
		}

		System.out.println("-------using Iterator-------");

		Iterator <Country> it = countries.iterator();
		while (it.hasNext()) {
		it.next().election();
		}

	}

}
