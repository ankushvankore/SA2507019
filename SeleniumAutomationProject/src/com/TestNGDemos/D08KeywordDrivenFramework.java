package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08KeywordDrivenFramework {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;

	@Test
	public void automobileTest() {
		driver.findElement(By.linkText(prop.getProperty("autoLT"))).click();
		//Select make = new Select(driver.findElement(By.id(prop.getProperty("makeDLId"))));
		//make.selectByIndex(2);
		new Select(driver.findElement(By.id(prop.getProperty("makeDLId")))).selectByIndex(3);
		driver.findElement(By.name(prop.getProperty("epName"))).sendKeys("1000");
		driver.findElement(By.xpath(prop.getProperty("dtMgXP"))).sendKeys("10/02/2025");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis); // Will load all the properties

		// System.out.println(prop.getProperty("url"));

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
	}

}
