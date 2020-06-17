package com.syntax.class02;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
	  
		
	int num1 = 10;
	int num2 = 5;
	
	
	//int num3 = num1; (value num3 same name1) 
	
	int sum = num1 + num2;
	
	int sub = num1 - num2;
	
	int div = num1 / num2;
	
	int mult = num1 * num2;
	
	
	
	
	
	
	System.out.println("addition--->" + sum);
	System.out.println("substraction-->" + sub);
	System.out.println("division--->" + div);
	System.out.println("multiplication-->" + mult);
	
	double d1 = 3.4;
	double d2 = 5.73;
	double dsum = d1 + d2;
	System.out.println("Double addition--->" + dsum);
	
	//you cane store an integer as double	
	double dsum2 = num1 + num2;
	System.out.println("dsum2--->" + dsum2);
	
	//order of operation
	System.out.println("Ahmet_"+ 10 +30);
	
	//first parenthesis, then concatenation
	System.out.println("Ahmet_"+ (10 + 30));
	
	System.out.println("Ahmet_"+ 10 * 30 );
	
	
	
	
	
	
	
	
	

	}

}
