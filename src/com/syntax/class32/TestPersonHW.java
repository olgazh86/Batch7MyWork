package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestPersonHW {

	public static void main(String[] args) {
		
		//PersonHW person = new PersonHW("Joe", "Doe", 55, 1000.00);
        
		Map<Integer, PersonHW> person = new LinkedHashMap<>();
		person.put(1,new PersonHW("Joe", "Doe", 55, 1000.00));
		
		Collection<PersonHW> values = person.values();
		
		for(PersonHW value : values) {
			value.details();
		}
		

	}

}
