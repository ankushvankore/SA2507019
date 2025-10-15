package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Priyanka");
		driver.findElement(By.id("lastName")).sendKeys("Pinglikar");
		driver.findElement(By.id("userEmail")).sendKeys("priyanka@gmail.com");
		js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-2")));
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 Jan 2005", Keys.ENTER);
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\ChatGPT Image Oct 13, 2025, 07_44_50 PM.png");
		
		js.executeScript("window.scrollBy(0, 200)", "");
		
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-1\"]")).click();
	}

}

