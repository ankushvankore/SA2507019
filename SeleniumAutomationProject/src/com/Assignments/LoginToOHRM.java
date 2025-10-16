package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToOHRM {
	WebDriver driver;

	@Test
	public void login1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void login2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void login3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("ashish");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ashish123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void login4() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("aparna");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("aparna123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
			
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
