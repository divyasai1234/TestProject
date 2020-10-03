package com.crm.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.BaseClass.TestBase;

public class ContactPage extends TestBase 
{
   @FindBy(xpath="//td[contains(text(),'Contacts')]")
   public static WebElement chkcontacttext;
   
   @FindBy(xpath="//input[@value='52743294']")
   public static WebElement chkbox;

   @FindBy(xpath="//input[@value='New Contact']")
   public static WebElement newcontacts;
   
   public ContactPage()
   {
	   PageFactory.initElements(driver,this);
   }
	
   //actions
   
   public String chkcontacttxt()
   {
	   System.out.println("Action1 CP");
	   return chkcontacttext.getText();
   }
   //action2
	
	public void chkchboxbyname()
	{
		System.out.println("Action2 CP");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		chkbox.click();
	}
	
	//action3
	public AddNewContact clickonnewcontactpage()
	{
		System.out.println("Action3 CP");
		System.out.println("inside Contactpage");
		newcontacts.click();
		return new AddNewContact();
		
	}
}
