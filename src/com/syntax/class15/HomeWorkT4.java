package com.syntax.class15;

import java.util.Scanner;

public class HomeWorkT4 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable
     String a="Love";
     String b ="you";
     System.out.println("Before swap: "+ a+ " "+b);
     
     a=a+b;
     b=a.substring(0,a.length()-b.length());
     a=a.substring(b.length());
     
     System.out.println("After: "+a +" "+b);
			
		
	}

}
