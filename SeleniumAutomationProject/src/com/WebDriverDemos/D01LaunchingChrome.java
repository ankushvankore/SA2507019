package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Launch the blank browser window.
		driver.manage().window().maximize();
		 
		driver.get("https://www.google.com/");
		
		driver.close();
	}

}
