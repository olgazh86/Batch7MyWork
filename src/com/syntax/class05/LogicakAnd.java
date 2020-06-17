package com.syntax.class05;

public class LogicakAnd {

	public static void main(String[] args) {
		
		//declare a number 
		//if number is between 1-10 number is small
		//f number is between 11-100 number is medium
		//f number is between 101-1001 number is large
		
		
		int num = 298000;
		
		if (num >= 1 && num <=10) {
			System.out.println(num + " is a small number");		
		}else if (num>=11 && num <=100) {
			System.out.println(num + " is a medium number");
		}else if (num >=101 && num<=1000) {
			System.out.println(num + " number is  a large");
		}else {
			System.out.println(num + " Number is extra large");
		}
	
		
	}

}
