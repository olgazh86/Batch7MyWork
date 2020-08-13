package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTAsk {

	public static void main(String[] args) {

		// 1. Create an arraylist of cars and retrieve all the values using
		// 3 different ways.

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tesla");

		for (String car : cars) {
			System.out.print(car);
		}
		System.out.println(" ---");
		for (int i = cars.size(); i <= cars.size(); i++) {
			System.out.print(cars);
		}
		System.out.println("---");
		Iterator<String> c = cars.iterator();
		while (c.hasNext()) {
			System.out.print(c.next() + " ");
		}

//2. Create an arrayList of words. Remove every word that ends with “e”.

		ArrayList<String> words = new ArrayList<>();

		words.add("Apple");
		words.add("Movie");
		words.add("Car");

		Iterator<String> word = words.iterator();

		while (word.hasNext()) {
			String w = word.next();
			if (w.endsWith("e")) {
				word.remove();
			}
		}
		System.out.println(words);

	}
}
