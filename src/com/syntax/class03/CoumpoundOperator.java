package com.syntax.class03;

public class CoumpoundOperator {
	
	public static void main(String[] args) {
     
    int num = 100;
	num = num + 100; //200
	System.out.println(num);

	num = num + 100;
	System.out.println(num);//300

	//use Compound operator "+=" which is shorter 
	num += 100;
	System.out.println(num);//400
	
	num -=50;// long way num - 50;
	System.out.println(num);//350
	
	num /= 7;
	System.out.println(num);//50
	
	
	
	//num = num % 9;
	num %= 9;
	System.out.println(num);
	
	
	
	
	
	
	
	
	
	
	
	}

}
