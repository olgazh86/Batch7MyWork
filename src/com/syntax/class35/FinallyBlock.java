package com.syntax.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str = "java";
		
		try {
			System.out.println("I am try block");
			char letter =str.charAt(10);
			System.out.println(letter);
		//}catch(Exception e) {
			//System.out.println("I am a catch block");
			//System.out.println(e);
		}finally {//always gets executed regardless if E occurs or not
			System.out.println("I am a finally block");
		}
		
		System.out.println("I am the end of the code");
		
		
		
		

	}

}
