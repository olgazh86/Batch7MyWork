
package com.syntax.class14;

public class StringMethods1 {
	
public static void main(String[] args) {
	
	// 1 way to create a String/ most popular 
	String name ="olga"; //literal 
	
	//2 way to create a String using new keyword
	String name1 =new String();
	name1="Olga";
	System.out.println(name);
	System.out.println(name1);
	
	//methods of String class
	String school="Syntax";
	
	System.out.println("---------Length mehod---------------------------");
	
	//how many characters are in the String 
	int size = school.length();
	System.out.println("The lenght of the String is = "+ size);
	
	String greetings = "Hello Syntax";
	int sizeOfDifferntString=greetings.length();
	System.out.println(sizeOfDifferntString);
	
	System.out.println("---------.toUpperCase(); method---------------------------");
	
	String city= "Washington DC";
	String newCity=city.toUpperCase();
	System.out.println(newCity);
	
	System.out.println("---------.toLowerCase(); method---------------------------");
	
	String lowerCaseString=newCity.toLowerCase();
	System.out.println(lowerCaseString);
	
	System.out.println("---------.concat(); method---------------------------");
	
	String country ="USA ";
	String capital="Washington DC";
	
	// + with String serves as concatenation operator
	//+ with numbers serves as arithmetic operator
	
	System.out.println(country +  capital);
	
	System.out.println(country.concat(capital));// will work only if both values
	//are of String type
	
	System.out.println("---------.isEmpty(); method---------------------------");
	//if length of string is =0--->then it is Empty
	
	String str ="Hello";
	boolean isEmpty=str.isEmpty();
	System.out.println(isEmpty);
	
	System.out.println("---------.trim(); method---------------------------");	
	
	String cat="My cat name is Jessy";
	String dog="   My dog  name   Charly    ";
	
	System.out.println("-------before trimming----------");
	System.out.println(cat);
	System.out.println(dog);
	
	System.out.println("-------after trimming----------");
	System.out.println(cat.trim());// cut at the beginning and the end
	System.out.println(dog.trim());
	
	
	
	
	
	
	
	
	
	
	
	
  }	

}
