package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("trapti");
		driver.findElement(By.id("txtPassword")).sendKeys("trapti123");
		driver.findElement(By.className("btn-primary")).click();
		
		String errMsg = driver.findElement(By.id("lblMsg")).getText();
		System.out.println("Error Message: " + errMsg);
		
		if(errMsg.equals("Invalid Username/Password"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		//System.out.println("Error Message: " + driver.findElement(By.id("lblMsg")).getText());
		
		driver.close();
	}

}
