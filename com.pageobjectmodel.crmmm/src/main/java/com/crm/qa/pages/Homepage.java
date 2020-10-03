package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.BaseClass.TestBase;

public class Homepage extends TestBase
{

	@FindBy(xpath="//td[contains(text(),'  User: Demo User')]")
	public static WebElement logincheck;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	public static WebElement contacts;
	
	
	
	//initialise page factory
	public Homepage()
	{
	PageFactory.initElements(driver,this);
	System.out.println("homepage pagefactory is initialised");
	}

	//actions
		
	
	public String verifyhomepagetitle()
	{
		System.out.println("action1 HP");
		return driver.getTitle();
	}
	
	
	public ContactPage clickoncontactpage() throws Exception
	{
		System.out.println("action2 HP");
		System.out.println("HP inside contact page");
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		contacts.click();
		return new ContactPage();
	}
	
	
	
	
}
