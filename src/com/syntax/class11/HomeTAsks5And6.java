package com.syntax.class11;

public class HomeTAsks5And6 {

	public static void main(String[] args) {
		//Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		String[] cars= {"Tesla", "Ford","BMW", "Porsche","KIA", "Maserati"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars [i] + ", ");
		}
		System.out.println();
		System.out.println("---------2nd way------------------");
		
		for (String car:cars) {
			System.out.print(car +" ,");
			
		}
		System.out.println();
		
		//Create an array of countries: north america countries, south america countries,
		//europe countries, asian countries, african countries. 
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
		String[] countries= {"USA", "Canada","Colombia", "Peru","Italy", "Germany", "Japan", "China", "Kenya","Uganda" };
		
		for (int x=0; x<countries.length; x++ ) {
			System.out.print(countries[x] + ", ");
		}
		System.out.println();
		
		for (String count:countries) {
			System.out.print(count + ", ");
		}
		System.out.println();
		System.out.println("Total countries is " + countries.length + " in the array.");
		
		
		
		
		
		
		
		

	}

}
