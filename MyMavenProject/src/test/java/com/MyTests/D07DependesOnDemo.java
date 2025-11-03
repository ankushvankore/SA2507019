package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependesOnDemo {
  @Test
  public void login() {
	  System.out.println("This is my login test");
	  Assert.assertTrue(false);
  }
  @Test(dependsOnMethods = "login")
  public void logout() {
	  System.out.println("This is my logout test");
  }
}
