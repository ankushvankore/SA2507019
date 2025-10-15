package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D33DragAndDropBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.linkText("Slider")).click();
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		int x = slider.getLocation().x;
		int y = slider.getLocation().y;
		
		act.dragAndDropBy(slider, x + 200, y).perform();
		
		System.out.println(slider.getSize());
	}

}
