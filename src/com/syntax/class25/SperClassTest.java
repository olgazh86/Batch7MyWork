package com.syntax.class25;

public class SperClassTest {

	public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		c.enjoy();//execute from parent class--> it's not overriding -->call method Hidden 
		
		//if you want execute 
		SuperClass.enjoy();
		SubClass.enjoy();

	}

}
