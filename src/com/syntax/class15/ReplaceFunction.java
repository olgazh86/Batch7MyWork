package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {
		String me = "I am a good tester";
		
		String str = "Hello";
		
		str = str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we", "us"); //if it find it--->replace it will not---does nothing
System.out.println("-----------.replaseAll()-------------------");
		
		String fromApplication = "Phone number is 1234567890";
		
		fromApplication = fromApplication.replaceAll("[A-Z]", "");
		
		System.out.println(fromApplication);//hone number is 1234567890
		
		fromApplication=fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println("New string value is ="+ fromApplication);
/////////////////////////////		//////////////
		String another = "Hello12345";
		
		another= another.replaceAll("[A-Z]","").replaceAll("[a-z]","");
		System.out.println(another);
		
	/////////////////////////////////////////////	
		
		String anotherWay = "HElloYIIhgjgjgkglhlg567483939";
		anotherWay= anotherWay.replaceAll("[A-Za-z]","");//567483939
		
		System.out.println(anotherWay);
///////////////////////////////////////		
		//replacing all numbers [0-9] from the string, if specific [0-5]
		String mix = "Hello5674848 friends 6785899";
		mix = mix.replaceAll("[0-9]","");//Hello friends
		System.out.println(mix);
		
/////////////////////////////////////////////////////////////////////////////
		
		//replace with special character ^
		String mix1= "hello %$^***%#";  ///every symbal replace with some things if need 
		mix1=mix1.replaceAll("[^A-Z-a-z0-9]", "");
		System.out.println(mix1);
		
		
		
	}

}
