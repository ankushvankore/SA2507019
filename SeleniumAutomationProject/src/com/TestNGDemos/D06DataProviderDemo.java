package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	@Test(dataProvider = "getData")
	public void f(Integer n, String s, double d) {
		System.out.println(n);
		System.out.println(s);
		System.out.println(d);
	}
	@AfterMethod
	public void afterMethod() {
	}


	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			new Object[] { 1, "a", 1.1 },
			new Object[] { 2, "b", 2.2 },
			new Object[] { 3, "c", 3.3 },
			new Object[] { 4, "d", 4.4 },
		};
		
		//Object[][] data = new Object[][] {{1 ,"A"}, {2, "B"}};
		
		//return data;
	}
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
