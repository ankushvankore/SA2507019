package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void printTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}

	@Test(priority = 3)
	public void testLittleBox() {
		driver.get("https://littleboxindia.com/");
	}

	@Test(priority = 4)
	public void testLibas() {
		driver.get("https://www.libas.in/?srsltid=AfmBOoosC9EkK-Vnt6QlbuDLJhsvwUoqSdzBKZkN8sAfT7QoKd4yTL-R");
	}

	@Test(priority = 2)
	public void testFirstCry() {
		driver.get("https://www.firstcry.com/?srsltid=AfmBOopCSYKI3yVo-xTL_NOHcOKjHQaL5qjAhjkKJHMMmRlaMlyXn0G2");
	}

	@Test(priority = 1)
	public void testOnyc() {
		driver.get("https://onyc.in/");
	}
}
