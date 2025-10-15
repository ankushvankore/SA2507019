package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/home-kitchen/home-appliances/washing-machines/fully-automatic-front-load~function/pr?sid=j9e%2Cabm%2C8qx&otracker=nmenu_sub_TVs+%26+Appliances_0_Fully+Automatic+Front+Load&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D30000");
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[8]/div[3]/div[1]/div[2]"));
		
		Actions act = new Actions(driver);
		//act.dragAndDropBy(slider, slider.getLocation().x - 10, slider.getLocation().y).perform();
		act.clickAndHold(slider).moveByOffset(50, 0).release().perform();
	}

}
