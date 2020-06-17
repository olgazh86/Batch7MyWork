package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	//widening, implicit casting, automatically
	double d = 7;
	System.out.println(d);
	
	//int i = 7.58; //compile time error/type mismatch
	//double to int
	
	//narrowing, explicit casting, manually
	 int i = (int) 7.58;
	 System.out.println(i);
	 
	 //narrowing a large number into a byte 
	 //explicitly doing it manually
   byte b = (byte) 123867;
   System.out.println(b);
			
	long l1 = 45;
	long l2 = 234566789947l;
		
	//from a big box into a small
	int number1 = (int) l1;
	System.out.println(number1);
	
	int number2 = (int) l2;	
	System.out.println(number2);
	
	System.out.println("#############################");
	int n1 = (int) 4.5;
	System.out.println(n1);
	
	double n2 = 4;
	System.out.println(n2);
	
	long n3 = 34477654455l;
	int ii3 = (int) n3;
	System.out.println(ii3);
	
	

	}

}
