package com.syntax.teamTasks;

public interface WebDriver {
	
	void open();
	void close();
	public String getTitle();

}

interface RemoteWebDriver extends WebDriver, TakeScreenshots{
	
	void navigate();
}

interface TakeScreenshots{
	
	void getScreenshot();	
}

class ChromeDriver implements RemoteWebDriver{
	
	String title;
	ChromeDriver(String title){
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void open() {
		System.out.println("ChromeDriver is open");
	}
	public void close() {
		System.out.println("ChromeDriver can close");
	}
	public void navigate() {
		System.out.println("ChromeDriver navigate");
	}
	public void getScreenshot() {
		System.out.println("ChromeDriver take screenshot");
	}
	
}

class FirefoxDriver implements RemoteWebDriver{
	
	String title;
	
	FirefoxDriver(String title){
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void open() {
		System.out.println("FirefoxDriver is open");
	}
	public void close() {
		System.out.println("FirefoxDriver can close");
	}
	public void navigate() {
		System.out.println("FirefoxDriver navigate");
	}
	public void getScreenshot() {
		System.out.println("FirefoxDriver take screenshot");
	}
	
	
}

class SafariDriver implements RemoteWebDriver{
	
String title;
	
    SafariDriver(String title){
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void open() {
		System.out.println("SafariDriver is open");
	}
	public void close() {
		System.out.println("SafariDriver can close");
	}
	public void navigate() {
		System.out.println("SafariDriver navigate");
	}
	public void getScreenshot() {
		System.out.println("SafariDriver take screenshot");
	}
	
	
}
