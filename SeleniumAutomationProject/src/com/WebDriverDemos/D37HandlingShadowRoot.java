package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D37HandlingShadowRoot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		SearchContext ss = driver.findElement(By.cssSelector("div[id=\"shadow_host\"]")).getShadowRoot();
		//Object ss is holding #shadow-root object
		ss.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Joshna");
	}

}
