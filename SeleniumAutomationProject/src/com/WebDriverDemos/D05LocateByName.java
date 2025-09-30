package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	/*
	 * 1. Enter user name as test@gmail.com
	 * 2. Enter password as 1234567890
	 * 3. Click on Login button		
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.name("email"));
		//Please read a control on the page whose name is email and store that control in object userName
		//Now an object userName is representing the control on the page.
		userName.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123467890");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
