package com.syntax.class07;

public class ClassTask2Loop {

	public static void main(String[] args) {
		//Create a boolean variable workDay and assign true create int 
		//variable day and assign it to 1
		//●As long as it is workDay print “I need a day off” and increase day.
		//●Once day is 6 print “I ”

		
		
		boolean workDay = true;
		int day = 6;
		
		while (day<=5) {
			System.out.println("I need a day off");
			day++;
		}
		System.out.println("i do not need a day off any more");
		
		//teacher way
		
		//boolean workDay = true;
		//int day = 1;
		
		while (workDay) {
			if (day<6) {
			System.out.println("I need a day off");
			day++;
			}else {
				System.out.println("i do not need a day off any more");
				workDay = false;
			}
		}
		
		//2nd way 
		
		
		while (workDay && day <=6) {
			if (day<6) {
			System.out.println("I need a day off");
			day++;
			}else {
				System.out.println("i do not need a day off any more");
				workDay = false;
			}
		}
		
		
		
	}

}
