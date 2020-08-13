package com.syntax.class27;

public interface Trustable {
	
	void trust();
}

interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
	
	//from java 8 inside intrface we can have default methods and static
	default void transferMoney(){
		System.out.println("All banks must do transfer");
	}
	
	static void chekCreditScore() {
		System.out.println("All banks check credit score");
	}
}


abstract class Mortgage{
	
	public abstract void giveMortgage();
}
	
interface Investments{
	
	void doInvest();
}


class PNC extends Mortgage implements Bank,Investments{
	
	public void deposit() {
		System.out.println("PNC bank take deposit");
	} 
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	public void trust() {
		System.out.println("PNC trust");
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortage");
	}
	public void doInvest() {
		System.out.println("PNC do Investments");
	}
}


 class BOA implements Bank{
	 
	public void deposit() {
		 System.out.println("BOA bank take deposit");
	 }
	 public void withdraw() {
		 System.out.println("BOA gives you your money");
	 }
	 public void trust() {
		 System.out.println("BOA trust");
	 }
 }