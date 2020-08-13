package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ObjectsInSetInsurance {

	public static void main(String[] args) {
		//we need to store objects of Health Pet Car
		
		Set<Insurance> lset=new LinkedHashSet<>();
		lset.add(new Pet("Cat", "PetPlus"));
		lset.add(new Car ("Tesla","Geico"));
		lset.add(new Health("Blue Cross"));
		
		//how to access variable and methods
		
		for(Insurance ins : lset) {
			//accessing variables
			System.out.println(ins.insuranceName);
			//calling method
			ins.getQuote();
			ins.cancellInsurance();
			System.out.println("-------");
			
		}
		
		System.out.println("---USING ITERATOR--------");
		
	Iterator<Insurance>	it = lset.iterator();
	
	while(it.hasNext()) {
		Insurance i = it.next();
		//accessing variable
		System.out.println(i.insuranceName);
		//accessing method
		i.cancellInsurance();
		i.getQuote();
	}

	}

}
