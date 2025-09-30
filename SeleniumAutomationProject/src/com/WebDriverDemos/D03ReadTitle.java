package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		driver.close();
	}

}
