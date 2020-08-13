package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassTest {

	public static void main(String[] args) {
		
		LinkedList<Card> card = new LinkedList<>();
		
		card.add(new Visa("Visa"));
		card.add(new MasterCard("Master Card"));
		card.add(new Amex ("American Express"));
		
		System.out.println("----for loop---------");
		
		for (int i = 0; i <card.size(); i++) {
			card.get(i).getPoints();
			card.get(i).getCash();
		}
		
		System.out.println("----advanced for loop------------");
		
		for(Card c : card) {
			c.getPoints();
			c.getCash();
		}
		
		
		System.out.println("-------iterator -----------------");
		
		
	          Iterator <Card> it = card.iterator();
	          
	          while(it.hasNext()) {
	        	  Card c = it.next();
	        	  c.getCash();
	        	  c.getPoints();
	        	}

	}

}
