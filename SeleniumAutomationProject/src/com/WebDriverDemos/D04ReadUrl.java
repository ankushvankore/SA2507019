package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadUrl {

	public static void main(String[] args) {
		String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", actUrl;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		actUrl = driver.getCurrentUrl();
		System.out.println("URL: " + actUrl);
		
		//if(actUrl.equals(expUrl))
		if(actUrl.contains("index.php"))
			System.out.println("Correct URL");
		else 
			System.out.println("Wrong URL");
		
		driver.close();		
	}

}
