package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D09POM_Client {
	WebDriver driver;
	RediffUtility r1;
	
	@Test
	public void registration1() {
		r1.enterFullName("Sumedha Rahate");
		r1.enterRediffId("sumedharahate");
		r1.setPassword("Sumedha@123");
		r1.setBirthDate("08", "MAR", "2000");
	}
	@Test
	public void registration2() {
		r1.enterFullName("Dipika Brahmankar");
		r1.enterRediffId("dipika");
		r1.setPassword("dipika@123");
		r1.setBirthDate("05", "APR", "2001");
	}

	@BeforeMethod
	public void refreshPage() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
