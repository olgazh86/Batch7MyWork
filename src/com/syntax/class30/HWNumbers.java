package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HWNumbers {

	public static void main(String[] args) {
		
		//1. Create an arrayList of even numbers from 1 to 50. 
		//Remove any number that is divisible by 5 from that arrayList.
		
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i = 2; i<=50; i++) {
			if(i%2==0) {
				number.add(i);
			}
		}
		
		Iterator<Integer> removeNumbers=number.iterator();
		
		while(removeNumbers.hasNext()) {
			if (removeNumbers.next()%5 ==0) {
				removeNumbers.remove();
			}
		}
		System.out.println(number);
		

	}

}
