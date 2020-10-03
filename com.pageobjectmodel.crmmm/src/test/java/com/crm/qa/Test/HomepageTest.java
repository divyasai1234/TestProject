package com.crm.qa.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.Homepage;




public class HomepageTest extends TestBase
{
	
Homepage homepage;
ContactPage contactpage;
	
	@Test(priority=4)
	public void validatehomepagetitleTest()
	{
		System.out.println("Action1 HPT");
		Homepage homepage=new Homepage(); 
		System.out.println("HT inside homepage");
		String tit=homepage.verifyhomepagetitle();
		System.out.println("home page title is : "+tit);
	Assert.assertEquals(tit,"CRMPRO");
	System.out.println("after homeuser text is checked");
	}
	
	
	@Test(priority=5)
	public  void contactpageclickTest() throws Exception
	{
		System.out.println("Action2 HPT");
		ContactPage contactpage=new ContactPage();
		Homepage homepage=new Homepage();
	Thread.sleep(3000);
	contactpage=homepage.clickoncontactpage();
	
	}
	

	
		
	

}
