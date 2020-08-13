package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeHW {

	public static void main(String[] args) {
		//1. Create a Map that will store Employee name and salary.
		//Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
		//John Smith=$100000
		
		Map<String, Integer> employee = new HashMap<>();
		employee.put("John Smith", 100000);
		employee.put("Mary Keyte", 267000);
		employee.put("Kiki Moo", 544890);
		employee.put("Nunu Mee", 118890);
		
		Set<Entry<String, Integer>> entEmployee= employee.entrySet();
		
		int larg=0;
		String name="";
		
		for(Entry<String,Integer> ent :entEmployee) {
			if(ent.getValue()>larg) {
				larg=ent.getValue();
			    name = ent.getKey();
			}
			
		}
		
System.out.println( name + "=$"+ larg);
		
		
		
		
		
		
		

	}

}
