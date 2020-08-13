package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {
		
		Map<Integer,Animals> life =new LinkedHashMap<>();
		//    veribls  classes
		life.put(1, new Dog("Dog","Grey"));
		life.put(2,new Monkey("Monkey","Brown"));
		life.put(3,new Zebra("Zebra","Black and White"));
		
		
		System.out.println("1 -----Using Entry Set---------");
		
		Set<Entry<Integer, Animals>> entries = life.entrySet();
		
		System.out.println("-----Access all variables and call availible methods of Animals---------");
		
		for (Entry<Integer,Animals> e : entries) {
			Animals animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			
			System.out.println("-----------");
		}
		//write with Iterator
		System.out.println("------Using Iterator_____________________________________");
		
	Iterator <Entry<Integer, Animals>> iterator = entries.iterator();
	        while(iterator.hasNext()) {
	        	Entry <Integer, Animals> an =  iterator.next();
	        	int key = an.getKey();
	        	Animals val = an.getValue();
	        	System.out.println(val.color+ " "+ val.type);
	        	val.eat();
	        	val.sleep();
	        	
		
	}
		
		
		System.out.println("2 ----UsingValues-------");
		
		Collection <Animals>values = life.values();
		
		for(Animals animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("----------------");
		}
		
		//write with iterator
		System.out.println("====================Using Iterator=======================");
		
		Iterator <Animals> colectionAnimals =values.iterator();
		
		while(colectionAnimals.hasNext()) {
			Animals animals = colectionAnimals.next();
			System.out.println(animals.color + " "+ animals.type);
			animals.eat();
			animals.sleep();
		}
		
		
		
		
		
		
		System.out.println("3 ----Using keySet-------");
		
		Set <Integer> keys = life.keySet();
		
		for(Integer key : keys) {
			Animals animal = life.get(key);
			System.out.println(animal.color);
			System.out.println(animal.type);
			animal.eat();
			animal.sleep();
		}
		
		
		System.out.println("====================Using Iterator=======================");
		Iterator<Integer> key =keys.iterator();
		while(key.hasNext()){
			int stA = key.next();
			System.out.println(stA+" " );
			
		}

	}

}
