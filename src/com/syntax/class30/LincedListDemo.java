package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LincedListDemo {

	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("beshparmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println("LinkedList after adding another collection " + food);

		food.remove("pizza");
		System.out.println("LinkedList after removing " + food);

		food.set(3, "brownie");
		System.out.println("LinkedList after replacing " + food);

		// get all values by 1

		Iterator<String> foodIT = food.iterator();

		while (foodIT.hasNext()) {
			String foood = foodIT.next();
			System.out.print(foood + " ");

			if (foood.equals("cookies") || foood.equals("brownie")) {
				foodIT.remove();
			}
		}
		System.out.println();
		System.out.println("LinkedList after Iterator = " + food);

		// list with Country type of obj

		LinkedList<Country> countries = new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Afganistan("Afganistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		
		System.out.println("Collection of country Objects has " + countries.size());

		for (Country c : countries) {
			c.election();
		}
		
		List <String> webelements = new LinkedList<>();
		webelements.add("Link");
		
		
		
		
		
		
	}

}
