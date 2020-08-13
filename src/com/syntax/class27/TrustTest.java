package com.syntax.class27;

public class TrustTest {

	public static void main(String[] args) {
	
		Trustable t = new PNC();
		t.trust();
		
		Bank b = new PNC();
		b.deposit();
		b.trust();
		b.withdraw();
		
		Mortgage m = new PNC();
		m.giveMortgage();
	
		Investments i = new PNC();
		i.doInvest();
		System.out.println("------- BOA ---------");
		
		Trustable tt = new BOA();
		tt.trust();

		Bank bb = new BOA();
		bb.deposit();
		bb.trust();
		bb.withdraw();
		
		
		
	
		
		
		

	}

}
