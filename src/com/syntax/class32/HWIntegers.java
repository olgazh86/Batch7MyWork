package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HWIntegers {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(34);
		numbers.add(22);
		numbers.add(11);
		numbers.add(19);
		numbers.add(86);
		numbers.add(22);
		numbers.add(11);
		
		Iterator<Integer> numberIt = numbers.iterator();
		int sum = 0;
		
		while(numberIt.hasNext()) {
			int num = numberIt.next();
			sum+=num;
		}
		System.out.println(sum);
		

	}

}
