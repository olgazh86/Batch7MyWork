package com.syntax.class30;

public abstract class Country {
	
	public String name;
	
	public Country(String name) {
		this.name= name;
	}
	
	public abstract void election();
	

}
class USA extends Country{
	
	public USA(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name + " hold presedential election every 4 years");
	}
}

class Kazakhstan extends Country{
	
	public Kazakhstan(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name + " hold  election whenwvwer they desided");
	}
	
}

class Afganistan extends Country{
	
	public Afganistan(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name + " hold  election every 5 years");
	}
	
}
