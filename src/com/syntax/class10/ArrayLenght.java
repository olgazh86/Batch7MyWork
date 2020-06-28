package com.syntax.class10;

public class ArrayLenght {

	public static void main(String[] args) {
		
		String[] name = new String[5];
		name[0] = "Kamila";
		name[1] = "Elshan";
		name[2] = "Yuriy";
		
		System.out.println(name[3]);
		

		
		
		String[] group1 = new String[5];
		group1[0] = "Kamila";
     	group1[1] = "Elshan";
		group1[2] = "Yuriy";
		
		
		int arrLength = group1.length;
		System.out.println("Length of the array is:" + arrLength);
		
		System.out.println("*************************");
		
		String[] group2 = {"Ali", "Ksenia","Olga", "Castro"};
		System.out.println("The size of group 2 is: " + group2.length);
		
		
		
	}

}
