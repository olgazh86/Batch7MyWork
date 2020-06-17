package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		//we are counting from 1-10 we want to stop loop 
		//when reach 4
		//////break
		
		for(int i= 1; i <=10; i++) {
			if (i == 4) { /// when we want stop
				break;
			}
			
			System.out.println(i);
		}
		
		//////continue
		for(int i= 1; i <=10; i++) {
			if (i == 4) { //////skipping this part
				continue;
			}
			
			System.out.println(i);
		}
		
		//////skip numbers
		
		//i want to print from 1-10
		//skip 5, 6,7
		
		for(int i= 1; i <11; i++) {
			if (i == 5 || i==6 || i==7) { ////skipping this part
				continue;
			}
			
			System.out.println(i);
		}
		
		//// print numbers from 1-100 
		//skip numbers between 35 and 55
		
		
		for(int i= 1; i <=100; i++) {
			if (i<=35 && i<=55) { 
				continue;
			}
			
			System.out.println(i);
		
		
		
		
		
		
		}
		
		
	}

}
