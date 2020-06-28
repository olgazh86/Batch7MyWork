package com.syntax.class11;

public class Task3Countries {

	public static void main(String[] args) {
		
		String[] countries = {"USA", "Belarus", "Ukraine"};
		
		for (String country : countries) {
			if (country.equals("USA")) {
				System.out.println("Washington");
			}else if (country.equals("Belarus")) {
              System.out.println("Minsk");
		    }else if (country.equals("Ukraine")) {
              System.out.println("Kiev");
		}
	}
		System.out.println("--------------------");
		
		
		for (int i = 0; i<countries.length; i++) {
			switch (countries [i]) {
			case "USA":
			System.out.println("The capital is Washington");
			 break;
			case "Belarus":
			System.out.println("The capital is Minsk");
				break;
			case "Ukraine":
			System.out.println("The capital is Kiev");
				break;
			default:
			System.out.println("Not in my list");
		
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
