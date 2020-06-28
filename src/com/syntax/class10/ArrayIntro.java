package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//Array is a tray of tea cups
		
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		//declare and initialize one array of integers
	int[] numbers = new int[4];//index from 0 to 3		
	numbers[0] = 10;	
	numbers[1] = 15;
	numbers[2] = 20;
	numbers[3] = 25;
         
	//access elements from the array
		System.out.println(numbers[3]);
		
	// if array is storing integer, 
		//when I get one element i will get one int	
		int element0 = numbers[0];
		
		//we are just declaring, not initializing
		String[] carArray; //preferred way
		
		//we are creating/ init
		carArray = new String[3];//The size is 3 --> with index 0, 1, 2

	    carArray[0] ="BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla";// give an exception
		
		String car = carArray[2];
		System.out.println(car);// or Sysout....(carArray[2]);
		
		System.out.println("*************************************");
		
		
	char[] letters = new char [4];
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
