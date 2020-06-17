package com.syntax.class07;

public class LoopHomeworkT3 {
public static void main(String[] args) {
	
	//Print even numbers from 20 to 1 (2 ways)
	
	//1-st way
	
	int num = 20;
	
	 while (num>=1) {
		System.out.println(num);
		 num-=2;
	}
	//2 way 
	 
	int num2 = 20;
	
	do {
		System.out.print(num2 + " ");
		num2-=2;
	}while (num2>=1);
	 
	
	
}
}
