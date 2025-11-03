package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener{
	public void onStart(ITestContext result)
	{
		System.out.println("Test started!!!");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Finished!!!");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + ": Test Fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() + ": Test Skipped");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Started execution of: " + result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + ": Test Passed");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
