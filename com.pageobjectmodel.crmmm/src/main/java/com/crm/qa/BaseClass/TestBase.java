package com.crm.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.crm.qa.pages.Loginpage;
import com.crm.qa.util.TestUtil;

public class TestBase 
{

	public static Properties config;
	public static WebDriver driver;
	public static CharSequence usernamee;
	XSSFRow row;
	
	public static WebElement getobject(String xpathvalue)
	{
		System.out.println("getobject is loaded");
		return driver.findElement(By.xpath(config.getProperty(xpathvalue)));
	}
	
	
	public TestBase()
	{
		System.out.println("config is loaded");
		try {
		 config =new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Divya Sai Sucharita\\workspace\\com.pageobjectmodel.crmm\\src\\main\\java\\com\\crm\\qa\\properties\\config.properties");
			config.load(fis);			
			System.out.println("path is loaded");
			} catch (FileNotFoundException e) 
		     {
				e.printStackTrace();
			 }catch(IOException e) 
		     {
				e.printStackTrace();
			 }
			
	}
	

@BeforeTest
public void setup() throws Exception
{
	Initialise();
	
	 
		System.out.println("LT before url ");
		
		
		
}

	
	public static void Initialise() throws Exception 
	{
		System.out.println("Inside initailase");
		String browser =config.getProperty("browser");
		
		switch(browser)
		{
		case "firefox":
		{
			System.out.println("inside case 1");
			driver=new FirefoxDriver();
			break;
		}	
		case "chrome":
		{
			System.out.println("inside case 2");
			driver=new ChromeDriver();
			break;
		}	
		default:
		{
			System.out.println("inside default driver");
			driver=new FirefoxDriver();
		}
		}
		
		
		//driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		System.out.println("before testurl");
		
		driver.get(config.getProperty("testurl"));
		//driver.get("https://classic.crmpro.com");
	
		System.out.println("url is entered");
		
		
		
	}
	

	
@AfterTest
public void teardown()
{
	driver.quit();
}
	
	
	
	
}
