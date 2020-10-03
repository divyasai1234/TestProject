package com.crm.qa.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/*
public class ITestListenerr implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)//2nd it will print
	{
		System.out.println("Test is started onTestStart" +result.getName());	//loginpagevalidateTest
		System.out.println("Test is started onTestStart" +result.getHost());	//null
		System.out.println("Test is started onTestStart" +result.getInstanceName()); //com.crm.qa.Test.LoginpageTest
		System.out.println("Test is started onTestStart" +result.getStartMillis());  //1589615819875
		System.out.println("Test is started onTestStart" +result.getEndMillis());	//0
		System.out.println("Test is started onTestStart" +result.getStatus());		//16
		System.out.println("Test is started onTestStart" +result.getTestName());   //null
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is started onTestSuccess" +result.getName());
		System.out.println("Test is started onTestSuccess" +result.getHost());
		System.out.println("Test is started onTestSuccess" +result.getInstanceName());
		System.out.println("Test is started onTestSuccess" +result.getStartMillis());
		System.out.println("Test is started onTestSuccess" +result.getEndMillis());
		System.out.println("Test is started onTestSuccess" +result.getStatus());
		System.out.println("Test is started onTestSuccess" +result.getTestName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is started onTestFailure" +result.getName());
		System.out.println("Test is started onTestFailure" +result.getHost());
		System.out.println("Test is started onTestFailure" +result.getInstanceName());
		System.out.println("Test is started onTestFailure" +result.getStartMillis());
		System.out.println("Test is started onTestFailure" +result.getEndMillis());
		System.out.println("Test is started onTestFailure" +result.getStatus());
		System.out.println("Test is started onTestFailure" +result.getTestName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is started onTestSkipped" +result.getName());
		System.out.println("Test is started onTestSkipped" +result.getHost());
		System.out.println("Test is started onTestSkipped" +result.getInstanceName());
		System.out.println("Test is started onTestSkipped" +result.getStartMillis());
		System.out.println("Test is started onTestSkipped" +result.getStatus());
		System.out.println("Test is started onTestSkipped" +result.getTestName());
		
	}

	

	@Override//1st it will print
	public void onStart(ITestContext result) {
		System.out.println("Test is started onStart" +result.getName());	//Test
		System.out.println("Test is started onStart" +result.getHost());	//Null
		System.out.println("Test is started onStart" +result.getStartDate());	//Sat May 16 13:26:44 IST 2020
		System.out.println("Test is started onStart" +result.getName());	//Test
		
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test is started onFinish" +result.getName());
		System.out.println("Test is started onFinish" +result.getHost());
		System.out.println("Test is started onFinish" +result.getStartDate());
		System.out.println("Test is started onFinish" +result.getStartDate());
		System.out.println("Test is started onFinish" +result.getName());
		System.out.println("Test is started onFinish" +result.getEndDate());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
*/
	
public class ITestListenerr extends TestListenerAdapter
{
	
}
