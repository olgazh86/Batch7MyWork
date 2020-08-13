package com.syntax.class27;

public abstract class Monkey {//0% abstraction
	
	public void jumps() {
		System.out.println("Monkey jumps");
	}

}

abstract class Mouse{//50% abstraction
	
	public void run() {
		System.out.println("All mouses can run");
	}
	
	public abstract void eat() ;
	
}