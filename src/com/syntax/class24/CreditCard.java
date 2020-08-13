package com.syntax.class24;

public class CreditCard {
	double balance, interest;
	
	public CreditCard (double balance) {
		this.balance = balance;
	}
    
	double interest() {
		if (balance<1000) {
			return balance*0.01;
		}else {
			return 0;
		}		
	}
}


class Visa extends CreditCard{
	
	public Visa (double balance) {
		super(balance);
	}
	  
	double interest() {
		if (balance>500) {
			return balance*0.1;
		}else {
			return 0;
		}
	}
}


class AX extends CreditCard{
	
	public AX (double balance) {
		super(balance);
	}
	double interest() {
		if (balance<400) {
			return balance*1;
		}else {
			return 0;
		}
	}
}

