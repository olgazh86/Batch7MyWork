package com.syntax.class11;

public class ClassTasks {

	public static void main(String[] args) {
		//create an array of cars store 6 elements. print them
		
	String[] car = {"Toyota", "BMW", "Honda", "Tesla", "Porsche", "Lada"};
	for (int i=0; i<car.length;i++) {
		System.out.print(car[i]+ " ");
	}
		System.out.println();
		
		//array of int and calculate the sum of all elements
		
	int[] num = new int [4];
// or int[] num ={55, 72, 15, 200};
	
	num[3] = 55;
	num[2] = 72;
	num[1] = 15;
	num[0] = 200;
	int sum = 0;	
		//or for (int nummbers : num){}
	    // sum+=numbers;
	
	for (int j =0; j<num.length; j++) {
		sum+=num[j];
	}	
		System.out.println("Sum of the numbers is "+ sum);
		
		
		System.out.println("---------------------");
		//array countries. 
		
		String[] countries = {"USA", "Belarus", "Ukraine"};
         for (String c : countries) {
        	 
		switch (c) {
		case "USA":
		System.out.println("The capital is Washington");
		  break;
		case "Belarus":
		System.out.println("The capital is Minsk");
		   break;
		case "Ukraine":
		System.out.println("The capital is Kiev");
		break;
		}
		
		}
		
         System.out.println("*************************");
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
