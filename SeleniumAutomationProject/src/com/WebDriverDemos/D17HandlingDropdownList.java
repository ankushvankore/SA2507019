package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		//Object countries is now representing your drop down list
		//Operations on this object are supposed to be performed on that drop down list
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>allCountries = countries.getOptions();
		System.out.println("Total no of Countries: " + allCountries.size());
		
		int i = 0;
		for(WebElement c : allCountries)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}
		
		//countries.selectByVisibleText("Netherlands");
		//countries.selectByContainsVisibleText("Neth");
		//countries.selectByValue("150");
		countries.selectByIndex(147);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
	}

}
