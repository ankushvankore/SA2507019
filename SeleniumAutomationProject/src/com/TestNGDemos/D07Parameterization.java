package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D07Parameterization {
	WebDriver driver;
	@Parameters({"userName", "password"})
	@Test
	public void loginTest(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("success"));
	}
	@Parameters({"un1", "ps1"})
	@Test
	public void loginTest1(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("success"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
