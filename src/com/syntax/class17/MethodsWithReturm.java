package com.syntax.class17;

public class MethodsWithReturm {
	
	
	public static void main(String[] args) {
		MethodsWithReturm obj = new MethodsWithReturm();
		//1
		boolean isItEven = obj.isEven(12);
		System.out.println(isItEven);//or sout(obj.isEven(12));
		
		//3
		String upperValue=obj.convertToUpper("Thao");
		System.out.println(upperValue);
		
		
		
	}
	

	
// 1 create a method that will accept an int value and return whether 
	//number is even
	
	boolean isEven(int a) {
		
		boolean even;
		if (a%2==0) {
			even=true;
		}else {
			even=false;
		}
		return even;
	}
	
	// 2 create a method will accept 2 int value and return the largest number
	
	int getLargest(int a, int b) {
		int largest;
		
		if(a>b){
		largest=a;
		}else {
		largest=b;
	}
	return largest;// return Value MUST be same type as Return 
	//that we declared in method header
	}
	
	// 3 create a method will accept String and return value all in UpperCase
	
	String convertToUpper(String value) {
		return value.toUpperCase();
	}
	
	
	
	
	
}
