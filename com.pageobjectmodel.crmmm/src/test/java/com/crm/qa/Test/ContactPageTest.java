package com.crm.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.pages.AddNewContact;
import com.crm.qa.pages.ContactPage;

public class ContactPageTest extends TestBase
{
	ContactPage contactpage;
	AddNewContact newcontact;
	@Test(priority=6)
	public void chkcontacttetTest()
	{
		System.out.println("Action1 CPT");
		contactpage=new ContactPage();
		String contactchk=contactpage.chkcontacttxt();
		System.out.println("contacttext is:"+contactpage.chkcontacttxt()+":spacedel");
		Assert.assertEquals(contactchk,"Contacts");
	}
	
	@Test(priority=7)
	public void selchkboxTest()
	{
		System.out.println("Action2 CPT");
		contactpage=new ContactPage();
		contactpage.chkchboxbyname();
		System.out.println("checkbox is clicked");
		
	}
	
	@Test(priority=8)
	public void newcontactTest()
	{
		System.out.println("Action3 CPT");
		System.out.println("inside contactpage test");
		contactpage=new ContactPage();
		 newcontact=new AddNewContact();
		newcontact=contactpage.clickonnewcontactpage();
	}

/*	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
*/
}
