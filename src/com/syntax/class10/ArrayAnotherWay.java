package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// create an array and stored the initial values
		String[] weekdays = {"Monday", "Tuesaday","Wednesday", "Thursday", "Friday"};
		
	
		//print element with index 3
		System.out.println(weekdays[3]);
		
		//you can't add more elements to the Array
		
		
		
		//1st way
		double[] balances = {10000, 23.50, 5540.0};
		System.out.println("total money is "+ (balances[0] + balances[1]+ balances[2]));
		
		//2nd way
		double total = balances[0] + balances[1]+ balances[2];
		System.out.println("total money is " +total);
		//if convert to int 2 ways	
		//int total = (int)balances[0] + (int)balances[1]+ (int)balances[2];
		//or
		// int total = (int) (balances[0] + balances[1]+ balances[2]);
		
		// don't create an array with no elements
		//becouse you can't add elements later 
		
		//int [] numbers1 = new int[];<------- no elements or negative (-6)
		int[] numbers2= {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
 		
		
	}

}
