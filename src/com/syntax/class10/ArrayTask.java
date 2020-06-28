package com.syntax.class10;

public class ArrayTask {

	public static void main(String[] args) {
		
	//	Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] letter = new char[6];		
		letter[0] = 'A';	
		letter[1] = 'B';
		letter[2] = 'C';
		letter[3] = 'D';
		letter[4] = 'E';
		letter[5] = 'F';
		System.out.println(letter[1]);
		
		
		char[] let = {'A', 'B', 'C', 'D', 'E','F'};
		System.out.println(let[1]);
		
//reate an array of names and store all names of your group.
//Then print your name from that array.
//(use 2 different ways of creating an array).
		
		String[] name = new String[4];		
		name[0] = "Olga";	
		name[1] = "Volha";
		name[2] = "Marta";
		name[3] = "Olivia";
		System.out.println(name[1]);
		
		String[] name1 = {"Volha","Marta", "Olivia"};
		System.out.println(name1[0]);
		
//Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using elements of array: “Saturday is Java coding Day”.		
		
		String[] word = {"Java","Saturday", "day", "coding","is"};
		
		System.out.println(word[1]+" "+ word[4]+ " "+ word[0]+ " "+ word[3]+ " "+ word[2]);
		
	}

}
