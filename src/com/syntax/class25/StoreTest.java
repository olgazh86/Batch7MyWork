package com.syntax.class25;

public class StoreTest {

	public static void main(String[] args) {
		//1 st way
		Store macys = new Macys("Macys", "New York"); 
		Store starbuks = new Starbucks("Starbuks","Chicago");
		Store nike = new Nike("Nike","Virginia","running");
		
		Store[] myStores = {macys, starbuks, nike};
		
		
		//2 way
Store[] stores ={new Macys("Macys", "Florida"), new Starbucks("Starbuks","Texas"), new Nike("Nike","Illinois","running")};
	      
    int size = stores.length;
    
    System.out.println(size);
	      
    for (Store s:stores) {
    	s.openHours();
    	s.sell();
    }
    
    
    System.out.println("-----Looping myStores----------------------");
    
    for (int i =0; i<myStores.length; i++) {
    	myStores[i].openHours();
    	System.out.println("--------------");
    }
    
    
    
    
	}

}
