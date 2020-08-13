package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {
		
Computer[]computers = {new Apple("Apple", "Best"), new Lenovo("Lenovo", "It's ok"), new HP("HP", "good"), new Dell("Dell","good")};
		
for (Computer c:computers) {
	c.brands();
	
}




	}

}
