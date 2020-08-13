package com.syntax.class26;

public abstract class Phone {
	
	public void makeCall() {
		System.out.println("Phone makes call");
	}
	
	public void sendText() {
		System.out.println("Phone send text");
	}
	 
	 public abstract void navigate();
	
	public abstract void playMusic();

}

class Samsung extends Phone{
	
	public void navigate() {
System.out.println("Samsung navigate....");
}
	public void playMusic() {
		System.out.println("Samsung play music from google store");
	}
	
}

class IPhone extends Phone{
	
	public void navigate() {
		System.out.println("iPhone navigate gps from google apple store");
	}
	
	public void playMusic() {
		System.out.println("iPhone plays music from Apple store");
	}
}


