package com.syntax.class25;

public final class FinalKeyword {//<---made class FINAL prevents inheritance 

	
	public static String str = "Hello";
	
	public static final String USERNAME = "Admin";//usual give Upper case name and MUST initialized
	public final String PASSWORD = "Admin 123";
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(str);
		
		str = "Hi";//you can change
		System.out.println(str);
		
		System.out.println(USERNAME);
		//username="User123";-->CE variable in final and we cannot change
		
		
		FinalKeyword fk = new FinalKeyword();
		//fk.PASWORD = "123user"CE variable is final
		System.out.println(fk.PASSWORD);
	}
	
	public final void hello() {
		System.out.println("Last hello of today");
	}	
	
}

//class FinalBAby extends FinalKeyword{<------can not create subclass Parent class is FINAL
	
	
	//FINAL method cannot be overridden
	//public void hello() { -->CE 
		//System.out.println("Sorry it not last hello");
	//}
	
//}


