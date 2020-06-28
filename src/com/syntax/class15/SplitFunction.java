package com.syntax.class15;

public class SplitFunction {

	public static void main(String[] args) {
		String str= "Today in Sunday and we have a Java class";
		
		String[] array =str.toLowerCase().split("d");///first convert to lower case then cut 
		int howManyElements=array.length;
		
	     for(String s:array) {
	    	 System.out.println(s);
	     }
		
		
		
		
		
         
	}

}
