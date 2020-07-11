package com.syntax.class19;

public class AppleStore {

	public static void main(String[] args) {
		
		IPhone phone1 = new IPhone();
		
		phone1.model="11Pro";
		phone1.memory=256;
		phone1.color="blue";
		phone1.price=1000;
		//phone1.displayInfo();---->possible but not prefferable
		IPhone.displayInfo();//calling static method 
		phone1.displayDetails();
		
		
		System.out.println("-------------2 iPhone object------------");
IPhone phone2 = new IPhone();
		
		phone2.model="11";
		phone2.memory=64;
		phone2.color="pink";
		phone2.price=900;
		IPhone.displayInfo();
		phone2.displayDetails();
		
		
		
		
		
		
	}

}
