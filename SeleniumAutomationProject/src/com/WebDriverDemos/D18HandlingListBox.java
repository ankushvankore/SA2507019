package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// WebElement lstBox =
		// driver.findElement(By.xpath("//*[@id=\"multiselect1\"]"));
		// Select cars = new Select(lstBox);
		Select cars = new Select(driver.findElement(By.xpath("//*[@id=\"multiselect1\"]")));
		List<WebElement> allCars = cars.getOptions();
		System.out.println("Total no of cars in the list: " + allCars.size());

		System.out.println("List of all cars");
		for (WebElement c : allCars)
			System.out.println(c.getText());

		if (cars.isMultiple()) {

			cars.selectByIndex(1);
			cars.selectByIndex(3);

			System.out.println("List of Selected Countries");

			List<WebElement> selectedCars = cars.getAllSelectedOptions();
			for (WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}
		//cars.deselectByVisibleText("Swift");
		//cars.deSelectByContainsVisibleText("Sw");
		//cars.deselectByIndex(1);
		//cars.deselectByValue("swiftx");
		cars.deselectAll();
	}

}
