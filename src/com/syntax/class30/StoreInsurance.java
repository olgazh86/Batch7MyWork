package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreInsurance {

	public static void main(String[] args) {
	
		ArrayList<Insurance> insurance = new ArrayList<>();
		
		insurance.add(new Car("Allstate", "Toyota"));
		insurance.add(new Pet("PetPlus","Dog"));
		insurance.add(new Health("BlueCross"));
		
		
		System.out.println("---for loop------------");
		
		for(int i=0; i<insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancellInsurance();
		}
		
		System.out.println("---andvanced for loop------------");
		
		for(Insurance in : insurance) {
			in.getQuote();
			in.cancellInsurance();
		}
		
		
		System.out.println("-----Using Iterator--------------");
		
		Iterator<Insurance> it = insurance.iterator();
		
		while(it.hasNext()) {
			Insurance in = it.next();
			in.getQuote();
			in.cancellInsurance();
		}

	}

}
