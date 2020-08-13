package com.syntax.class24;

public class Bank {//parents 
	double money, fee;
	
	public Bank(double money){//constructor
		this.money= money;
	}
	
	double chargeFee() {//overridden method
		if (money<1000) {
			return money*0.01;
		}else {
			return 0;
		}		
	}
}


class BOA extends Bank{//child 1 
	
	public BOA(double money) {//constructor
		super(money);
	}
	//method call from parents class
}


class PNC extends Bank{//child 2 
	
	public PNC(double money) {//constructor
		super(money);
	}
	
	double chargeFee() {//overriding method 
		if (money<1000) {
			return money*0.02;
		}else {
			return 0;
		}
	}
}

class Citi extends Bank{
	
	public Citi(double money){
		super(money);
	}
	
	double chargeFee() {
		if (money<1000) {
			return money*0.02;
		}else {
			return 0;
		}
	}
}




