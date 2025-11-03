package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class D08IndicesDemo {
  @Test(dataProvider = "dp")
  public void login(String n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider(indices = {2, 3})
  public Object[][] dp() {
	  return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "trapti", "trapti123" },
			new Object[] { "joshna", "joshna123" },
			new Object[] { "aparna", "aparna123" },
		};
		
  }
}
