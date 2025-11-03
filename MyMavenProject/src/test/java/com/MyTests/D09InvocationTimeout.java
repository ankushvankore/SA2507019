package com.MyTests;

import org.testng.annotations.Test;

public class D09InvocationTimeout {
	@Test(invocationTimeOut = 5000)
	public void test1() throws InterruptedException {
		System.out.println("Test Started");
		Thread.sleep(4000);
		System.out.println("Test Ended");
	}
}
