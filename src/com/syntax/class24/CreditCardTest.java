package com.syntax.class24;

public class CreditCardTest {

	public static void main(String[] args) {
		
		
		CreditCard cc = new CreditCard(800);
		double interest  = cc.interest();
		System.out.println(interest);
		
		
		Visa visa = new Visa(600);
		double interestVisa = visa.interest();
		System.out.println(interestVisa);
		
		AX ax = new AX(1000);
		double interestAX = ax.interest();
		System.out.println(interestAX);
		
		

	}

}
