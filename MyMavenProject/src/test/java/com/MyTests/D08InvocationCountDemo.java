package com.MyTests;

import org.testng.annotations.Test;

public class D08InvocationCountDemo {
	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("My Test");
	}

}
