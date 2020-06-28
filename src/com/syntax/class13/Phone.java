package com.syntax.class13;

public class Phone {
	
	String name;
	String model;
	int year;
	int memory;
	int price;
	
	  public static void main(String[] args) {
			
		    Phone ph1=new Phone();
		    ph1.name="iPhone";
		    ph1.model="11 Pro";
		    ph1.year=2020;
		    ph1.price=679;
		    System.out.println(ph1.name+ " and model is "+ph1.model+ " and year is " +ph1.year+ " price is $"+ ph1.price);
		    ph1.imaging();
		    ph1.display();
		    ph1.network();
		    
		 System.out.println("------------------------");   
		    
		 Phone ph2=new Phone();
		    ph2.name="Google";
		    ph2.model="Pixel4";
		    ph2.year=2020;
		    ph2.price=799;
		    System.out.println(ph2.name+ " and model is "+ph2.model+ " and year is " +ph2.year+ " price is $"+ ph2.price);
		    ph2.imaging();
		    ph2.display();
		    ph2.network();
		    
		  System.out.println("------------------------");    
		    
		  Phone ph3=new Phone();
		    ph3.name="Nokia";
		    ph3.model="TA-1178";
		    ph3.year=2020;
		    ph3.price=300;
		    System.out.println(ph3.name+ " and model is "+ph3.model+ " and year is " +ph3.year+ " price is $"+ ph3.price);
		    ph3.imaging();
		    ph3.display();
		    ph3.network();
		  
			}
	

	void imaging() {
		System.out.println(name+ " hase integrated camera");
	}
	void display() {
		System.out.println(name+ " hase touch screen");
	}
    void network() {
    	System.out.println(name+ " Wirless Compatibility: Bluetooth, Wi-Fi, Wireless A,");
    }
    
    
  
    
  
    
    
}
