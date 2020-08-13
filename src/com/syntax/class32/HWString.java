package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedHashSet;

public class HWString {

	public static void main(String[] args) {
		Collection<String> str = new LinkedHashSet<>();
		
		str.add("I need");
		str.add("to go");
		str.add("on");
		str.add("vacation");
		
		String total = "";
		
		for(String word : str) {
			total+=word+ " ";
		}
		System.out.println(total);
	}

}
