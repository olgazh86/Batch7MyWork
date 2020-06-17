package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean cold = true;
		
		if (!cold) {// not cold 
			System.out.println(1);
		}else {
		System.out.println(2);
		}
		System.out.println("---------------");
		
		int day = 4;
		//1st way
		if (day != 1 && day != 5) {
			System.out.println("have class'");
		}else {
			System.out.println();
		}
		
		
	}

}
