package com.syntax.class26;

public class PhoneTest {
	
public static void main(String[] args) {
	
	//new Phone(); CE we cannot create an object of Abstract class
	Phone iphone = new IPhone();//upcasting 
	iphone.navigate();
	iphone.playMusic();
	iphone.sendText();
	iphone.makeCall();
	
	Phone samsung = new Samsung();
	samsung.navigate();
	samsung.makeCall();
	samsung.playMusic();
	samsung.sendText();
}
}
