package com.syntax.class35;

public class CatchingException {

	public static void main(String[] args) {
		
		
		int a=10;
		int b= 0;
		
		try {
		System.out.println(a/b);
		//throw new ArithmeticException();
		
		}catch(Exception ae) {//<---grand parent can take care of ArithmeticException
			   //Exception ae = new ArithmeticException();<--assigning
			//ae.printStackTrace();<-method for see all information 
			System.out.println(ae.getMessage());//<--method printed message (name and message)
		}
		System.out.println("End of the code");
	}

}
