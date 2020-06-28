package com.syntax.class12;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		
		int [] numbers = {6, 12,78,43,22};
		int larger=numbers[0];
		int secondLarg=numbers[0];
		
		
		for (int i=0; i<numbers.length;i++) {
			if (numbers[i]>larger) {
				secondLarg =larger;
				larger = numbers[i];		
				
			}else if (numbers[i]>secondLarg) {
				secondLarg = numbers[i];
			}
		}
		
		System.out.println("the second largest number is "+ secondLarg);	
	System.out.println("----------------------------------------------------------------");	
		//Maximum and minimum number in the array?

	int[] num = {100,34,356,289,55};
	int max= num[0];	
	int min = num[0];
	
	for (int i =0; i<num.length;i++) {
		if (max< num[i]) {
			max=num[i];
		}
	}
		System.out.println("max number is "+ max);
		
		for (int x=0; x <num.length;x++) {
			if (num[x]<min) {
				min=num[x];
			}
		}
		System.out.println("min number is "+ min);
		
		
		
		
		
		
		
		
	}

}
