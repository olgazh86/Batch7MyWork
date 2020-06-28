package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer strBuffer =new StringBuffer("Hello");//is mutable object=changeable
		strBuffer.append(" friends");//don't need reasining
		
		System.out.println(strBuffer);//Hello friends
		
		
		String str2="Hello";//String is Immutable=not changeble object 
		str2.concat(" friends");
		System.out.println(str2);//Hello

	}

}
