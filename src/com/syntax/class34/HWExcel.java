package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWExcel {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws IOException, InterruptedException {

		String xlFile = System.getProperty("user.dir") + "/testdata/Employee.xlsx";

		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlList = new ArrayList<>();

		for (int r = 1; r < rows; r++) {

			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < col; c++) {
				String key = sheet.getRow(r).getCell(0).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlList.add(map);
		}
		System.out.println(xlList);
		

		System.setProperty("webdriver.chrome.driver", "/Users/volhazhmurko/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//driver.manage().window().maximize();

		for (Map<String, String> littleMap : xlList) {
			
			Set<String> users = littleMap.keySet();
			
			for(String user : users) {
				String password = littleMap.get(user);
				WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
				WebElement pas = driver.findElement(By.xpath("//input[@id='txtPassword']"));
				
				username.sendKeys(user);
				pas.sendKeys(password);
				Thread.sleep(2000);
				
				WebElement logInBut = driver.findElement(By.id("btnLogin"));
				logInBut.click();
				Thread.sleep(2000);
				
				WebElement welcome = driver.findElement(By.xpath("//a[@id = 'welcome']"));
				Thread.sleep(2000);
				String text = welcome.getText();
				System.out.println(text);
				welcome.click();
				
				WebElement logoutBut = driver.findElement(By.xpath("//a[text()='Logout']"));
				logoutBut.click();
				Thread.sleep(2000);
				
				driver.quit();
				
			}
		}

	}

}
