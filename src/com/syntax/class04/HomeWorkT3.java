package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkT3 {
public static void main(String[] args) {
	
	//Create a Java program that will ask user to input city and temperature.
	//Your program should convert Fahrenheit into celsius and print 
	//"The temperature is the city __ is __"
	
	
	Scanner scann = new Scanner(System.in);
	
	System.out.println("Please, enter your City");
	String city = scann.nextLine();
	
	System.out.println("Plese, enter temprature in Farenheit (Numbers.)");
	double temp = scann.nextDouble();
	
    double cels = (temp - 32)* 5 /9;
   System.out.println("The temperature is the city "+ city + " is "+ cels+ ".");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
