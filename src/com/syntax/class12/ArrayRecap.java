package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {
		
		String[] colors = new String[3];
		colors[0] = "red";
		colors[1] = "yellow";
		colors[2] = "blue";
		
		System.out.println(colors.length);
		String color= null;
		
		for (int b=0; b<colors.length; b++) {
			 color=colors[b];
		}
		System.out.println(color);
		
		System.out.println();
	System.out.println("--------------------------");	
	//advance loop	
		for (String c : colors) {
		System.out.println(c);
		}
		
		
	}

}
