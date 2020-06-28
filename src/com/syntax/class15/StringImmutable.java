package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {
		String str="Today is a good day";// new object gets created 
		
		str = str.replace("good", "amazing");//new object created 
		
	
		String str1=new String("Hello");
		
		String str2= "Hello";
		String str3= "Hello";
		
		
		str2.toUpperCase();//completley new string Object is getting created 
		str2 = str2.toLowerCase();
		System.out.println(str2);
		
		
		
		
		
		
	}

}
