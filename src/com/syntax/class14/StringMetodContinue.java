package com.syntax.class14;

public class StringMetodContinue {

	public static void main(String[] args) {
		
System.out.println("---------.contains(); method---------------------------");

		// chek if String contains another sequence of specified character
		String str ="Good afternoon all";
		//String searchValue="afternoon";
		
		boolean contains =str.contains("afternoon");
		System.out.println(contains );
		
String searchValue="good";
		boolean isItThere = str.contains(searchValue);
		System.out.println(isItThere);// false case sensitive 
		
System.out.println("---------.startsWith(); method---------------------------");	
		String drink ="water";
		boolean starts=drink.startsWith("w");
        System.out.println(starts);
	
System.out.println("---------.endsWith(); method---------------------------");	
		
		boolean ends=drink.startsWith("a");
        System.out.println(ends);
		
   System.out.println("---------.equals(); method---------------------------");	
			
		String string1="Saturday";
		String string2="Saturday";
		boolean equality=string1.equals(string2);
		System.out.println(equality);
		
		boolean equalityNoCase=string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase);
		
System.out.println("---------REal exemple.equals(); method---------------------------");
		 
		String expected="PAssword cannot be empty";
		String actual ="Password can not be empty";
		if (expected.equals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
System.out.println("---------REal exemple.equalsIgnoreCase(); method---------------------------");		
		
	String expBrowser="Chrome";
	if(expBrowser.equalsIgnoreCase("crome")) {
		
	}
		
		
		
		
		
	}

}
