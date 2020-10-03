package com.crm.qa.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.util.TestUtil;

//@Listeners(com.crm.qa.util.ITestListenerr.class)		//class level assing listeners
public class LoginpageTest extends TestBase
{
	
	Loginpage	loginpage;
	Homepage homepage;
	TestBase excel;
	TestUtil util;
	

 	 public LoginpageTest() throws Exception	 
	{
		super();
		System.out.println("super is called");
				
	}

 
 	

 	 
@Test(priority=1)
public void loginpagevalidateTest()
{
	System.out.println("Action1 LPT");
	 loginpage=new Loginpage();
	String title=loginpage.validateloginpagetitle();
	System.out.println("LT title is"+title);
	Assert.assertEquals(title,"CRMPR - CRM software for customer relationship management, sales, and support.");
}

@Test(priority=2)
public void crmlogoTest()
{
	System.out.println("Action2 LPT");
	boolean flag=loginpage.validatelogotext();
	Assert.assertTrue(flag);
	System.out.println("LT crmlogo is checked");
}
@Test(priority=3)
public void multilogin() throws Exception
{
	util=new TestUtil();
	List<String> retvalue=util.excelreader();
	System.out.println("after reading multiplelogin");
	System.out.println("retvalue is : "+retvalue);
	
	System.out.println("index 0 is : "+retvalue.get(0));
	System.out.println("index 0 is : "+retvalue.get(1));
	System.out.println("index 0 is : "+retvalue.get(2));
	System.out.println("index 0 is : "+retvalue.get(3));
	System.out.println("size of list is : " +retvalue.size());
	for(int i=0;i<retvalue.size();i++)
	{
		System.out.println("inside for loop username: "+retvalue.get(i));
		loginpage.username.sendKeys(retvalue.get(i));
		i++;
		System.out.println("inside for loop password : "+retvalue.get(i));
		loginpage.password.sendKeys(retvalue.get(i));
		loginpage.loginbutton.click();
		Thread.sleep(2000);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	WebDriverWait wait=new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\\*[@name='username']")));
		
		
		System.out.println("login button is clicked");
	}
		
}


}
