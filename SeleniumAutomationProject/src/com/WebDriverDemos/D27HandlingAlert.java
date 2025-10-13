package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27HandlingAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		Alert alt;		//Reference of Alert interface
		
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();	//Now alt holding the alert
		System.out.println(alt.getText()
				);
		alt.accept();						//Will click on Ok button
	}

}
