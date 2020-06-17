package com.syntax.class02;

public class HomeWork05_30 {

	public static void main(String[] args) {
		
	//1. Write a Java program to add, subtract, multiply and divide 2 decimal values. Program should say. 
		//"The _____ of 2 numbers ___ and ____ is equal to ___" 
		
		//decimal values
		 double num1 = 1.3;
		 double num2 = 2.2;
		 
		 //operation	 
		 double add = num1 + num2; 
		 double sub = num1 - num2;
		 double mult = num1 * num2;
		 double div = num1 / num2;
		 
		 //string operation
		 String add1 = "addition";
		 String sub2 = "subtraction";
		 String mult3 = "multiply";
		 String div4 = "divide";
		 
		 //print
		 System.out.println("The " + add1 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + add);
		 System.out.println("The " + sub2 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);	
		 System.out.println("The " + mult3 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);
		 System.out.println("The " + div4 + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		
	System.out.println("*********************************");
		
	//2. Write a program to find the square of the number 3.9.
		//You program should say "The square of the __ is __" 
		 
		 double number = 3.9;
		 double square = number * number;
		 
		 System.out.println("The square of the " + number + " is " + square);
		 //System.out.println("The square of the " + number +
		 // " is " + number*number);
	
		 System.out.println("******************************");
		 
	//3. Program to print the area and perimeter of a rectangle with width = 5 and height = 8. your program should say.
		//("The perimeter of a rectangle with width __ and height ___ is equal to ___ and the area is __ "
		 
           byte width = 5;
           byte height = 8;
            
           
System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + (2 * width + 2 * height) + " and the area is " + width * height);
           
 System.out.println("***********************************");        
 
          int per = width * 2 + height * 2;//int per = 2 * (width+height);
          int area = width * height;
          
          System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + per + " and the area is " + area);
          
        
           
        	
        	   
		
		
		
		
		
		
		
		
		
		
	}

}
