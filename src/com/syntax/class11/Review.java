package com.syntax.class11;

public class Review {

	public static void main(String[] args) {
		
		int[] grades = new int [5];
		
		int size = grades.length;
		System.out.println("array size is ; " + size);
		
		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		
		//1 st silly way
		int average = (grades[0] + grades[1] +grades[2]+grades[3]+grades[4]) /size;
		
		System.out.println("Class average is "+ average);
		
        //2 way best
		int total = 0;   // k<5
		for (int k =0; k<size; k++) {
			total +=grades[k];
		}
		
		System.out.println("Class average is "+ total/5);
		
	
		
		
	
		System.out.println("--------------------------------------------------");
	String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington"};	
		System.out.println("I live in " + cities[2]);
		
		int i = 1;
		System.out.println("I live in " + cities[i]);
		
		i+=2;
		System.out.println("I moved to "+ cities[i]);
		
		int cityNumber =cities.length;
		System.out.println("Total number of cities is: "+ cityNumber);
		
		System.out.println("The last city in the list is "+ cities[cityNumber-1]);
		
		// i want print all cities 
		              //or cities.length
		for (int j=0; j<cityNumber; j++) {
			System.out.println(cities[j]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
