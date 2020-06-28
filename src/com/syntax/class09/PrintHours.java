package com.syntax.class09;

public class PrintHours {

	public static void main(String[] args) {
		// Let print clock
		//00:00
		//00:01
		//....
		//1:00
		///...
		//1:01
		//23:58
		//23:59
		//hour goes from 0 to 23
		//minute from 0 to 59
		
		for (int h =0; h<24;h++) {
			
		for (int m =0; m<60; m++) {		
			System.out.println(h + ":" +m);
		}
		}
		
		
		
		
		
		
		
		
	}

}
