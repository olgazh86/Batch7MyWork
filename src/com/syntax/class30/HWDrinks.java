package com.syntax.class30;

import java.util.ArrayList;

public class HWDrinks {

	public static void main(String[] args) {

		// 1. Create an arrayList of drinks. If any drink has letter “a”
		// or “e” replace it with water. 

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("Fanta");
		drinks.add("Coca-Cola");
		drinks.add("Root beer");
		drinks.add("Sunkist");
		System.out.println(drinks);

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}

		}
		System.out.println(drinks);

	}

}
