package com.syntax.class07;

public class LoopHomeWork1 {
public static void main(String[] args) {
	
	//Print numbers from 1 to 100 in 1 line with space
	int num = 1;
	
 while (num<=100) {
	System.out.print(num + " ");
	 num++;
}
	
 //Print numbers from 100 to 1
	int num1 = 100;
 while (num1>=1) {
	 System.out.println(num1);
	 num1--;
 }
	//teacher way
 
	for (int i=100; i>=1; i--) {
		System.out.println(i);
	}
	
	//print numbers 1,2,3
	for (int i=1; i<=3; i++) {
		System.out.print(i+",");
	}
}
}
