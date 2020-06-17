package com.syntax.class07;

public class LoopWhile {

	public static void main(String[] args) {
		
	int time = 10;
	
	if (time>12) {
		System.out.println("Good Morning!");// execute one time
		
	}
     //this code will execute infinitely (non stop) but its fixed by add time++
	while (time<12) {
		System.out.println("Good Morning!");
		time++;
	}
	
	
	
	///not execute
	while (time>12) {
		//this block of code will never execute
		System.out.println("Good Morning!");
	}
	
System.out.println("****************************************");
	boolean isRain=true;
	
	while (isRain) {
		System.out.println("Take your umbrella"); //printed infinitely
	}
	
	
	while (isRain) {
		System.out.println("Take your umbrella");
		//isRain++; compile error
		isRain = false;//its print 1 time 
		
	}
	
	
	//how to print number from 1 to 50?
	
	int a = 1;
	while (a<=50) {
		System.out.println("a");
		a++;//need to be inside the block
	}
	//how to print from 5 to 15 at the same line
	
	int z= 5;
	while (z>15) {
		System.out.print(z + " ");
		z++;
	}
	
	//how to print from 10 to 1?
	int s= 10;
	while (s>=1) {
		System.out.println(s);
		s--;//or --s; (if increase)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
