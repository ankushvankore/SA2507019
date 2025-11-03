package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S08DDF_OHRMLogin {
	WebDriver driver;
	
	@Given("Launch OHRM Site {string}")
	public void launch_ohrm_site(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
	}

	@When("I Enter valid user name as {string} and valid password as {string}")
	public void i_enter_valid_user_name_as_and_valid_password_as(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}

	@When("I Click on the Login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dashboard page should display")
	public void dashboard_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}
