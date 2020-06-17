package com.syntax.class05;

public class MoreLogicalOperators {
 
	public static void main(String[] args) {
	
	//We have 7 days of week
	//if day is 2, 4 --->SDLC
	//if day is 6, 7----->JAVA class	
	//if day is 5 -->Review class
	//if day 1, 3----> no class	
	
	int day = 5;
	// to compare to equality of two numbers we use ==
		
	if (day == 2 || day == 4) {
		System.out.println("SDLC");
	}else if (day == 6|| day == 7)	{
		System.out.println("JAVA class");
	}else if (day == 1 || day == 5) {
		System.out.println("no class");
	}else if (day == 3) {
		System.out.println("REview");
	}
		System.out.println("--------------------------");
		// to compare the equality of two Strings we use .equals()
		
		String day2 = "Tuesday";
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC");
		}else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			
		}
		
		
		
		
}
}
