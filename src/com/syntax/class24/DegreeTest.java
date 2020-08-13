package com.syntax.class24;

public class DegreeTest {

	public static void main(String[] args) {
		
		Degree dg = new Degree();
		dg.getPrerequisite();
		
		Bachelors bach = new Bachelors();
		
		bach.getPrerequisite();
		
		Master mas = new Master();
		mas.master ="Master degree";
		mas.getPrerequisite();

	}

}
