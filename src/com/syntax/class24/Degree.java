package com.syntax.class24;

public class Degree {
	String degree;
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

 class Bachelors extends Degree{
	 String bachelor;
	 
}
 class Master extends Degree{
	 String master;
	 void getPrerequisite() {
			System.out.println("To get a degree you need high school diploma and "+ master);
		}
 }