package com.crm.qa.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.util.TestUtil;

public class Loginpage extends TestBase
{
	//pagefactory
  @FindBy(name="username")
  public static WebElement username;
  
  @FindBy(name="password")
  public static WebElement password;
  
  @FindBy(xpath="//*[@id='loginForm']/div/div/input")
  public static  WebElement loginbutton;
  
  @FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
  public static  WebElement crmlogo;
  
//creating constructor and initialisation
public Loginpage()
{	System.out.println("inside page factory");
	PageFactory.initElements(driver,this);
	System.out.println("LP pagefoctory is initialized");
}

//Actions

public String validateloginpagetitle()
{
	System.out.println("Action1 LP");
	
	return driver.getTitle();
}

public boolean validatelogotext()
{
	System.out.println("Action2 LP");
	
	return crmlogo.isDisplayed();
}



	




}