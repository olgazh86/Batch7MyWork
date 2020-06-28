package com.syntax.class11;

public class LargestNumberArray {

	public static void main(String[] args) {
		int[] numbers = {23, 56, 73, 16, 80, 70,39};
	
		int largest = 0;
		for (int num : numbers) {
			if (num>largest) {
				largest = num;
			}
		}
		System.out.println(largest);
		
		
		
		int[] num = {23, 56, 73, -16, -80, -70,-39};
		
		int larg = num [0];
		for (int numb : num) {
			if (numb>larg) {
				larg = numb;
			}
		}
		System.out.println(larg);
		
		

	}

}
