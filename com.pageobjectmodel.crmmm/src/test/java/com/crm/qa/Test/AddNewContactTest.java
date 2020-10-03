package com.crm.qa.Test;

import java.util.List;

import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.pages.AddNewContact;
import com.crm.qa.util.Mapwithdataprovider;


public class AddNewContactTest extends TestBase
{
	
	
	AddNewContact newcontact=new AddNewContact();
	Mapwithdataprovider mapprovide;
	
	@Test(priority=9)
	public void contacterstitleTest()
	{
		System.out.println("Action1 NCT");
		System.out.println("inside addnewconatct test ");
		newcontact.contacttitle(newcontact.Titledropdown, 4);
		newcontact.contacttitle(newcontact.categorydropdown, 3);
		newcontact.contacttitle(newcontact.statusdropdown, 1);
		newcontact.contacttitle(newcontact.suffixdropdown, 7);
		newcontact.contacttitle(newcontact.messengernetworkdropdown, 2);
		newcontact.contacttitle(newcontact.sourcedropdown, 4);
		
	}
	
	@Test(priority=10)
	public void checkboxesTest()
	{
		System.out.println("Action2 NCT");
		newcontact.checkbox();
	
	}
	@Test(priority=11)
	public void autoit() throws Exception
	{
		newcontact.fileupload.click();
		newcontact.autotool();
	}
	
	
	@Test(priority=12)
	public void filltextboxTest() throws Exception
	{
		mapprovide=new Mapwithdataprovider();
	
	  
	  	List<String> contacts=mapprovide.excelreader1();
	 
		System.out.println("Action3 NCT");
		System.out.println("contacts details are : "+contacts);
		
		System.out.println("after mapdataprovider");
		
		
		for(int i=0;i<contacts.size();i++)
		{
			System.out.println("contacts list are : " +contacts.get(i));
			newcontact.FirstName.sendKeys(contacts.get(i));
			i++;
			newcontact.Middlename.sendKeys(contacts.get(i));
			i++;
			newcontact.LastName.sendKeys(contacts.get(i));
			i++;
			newcontact.Email.sendKeys(contacts.get(i));
			i++;
			newcontact.AltEmail.sendKeys(contacts.get(i));
			i++;
			newcontact.Nickname.sendKeys(contacts.get(i));
			i++;
			newcontact.Company.sendKeys(contacts.get(i));
			i++;
			newcontact.Position.sendKeys(contacts.get(i));
			i++;
			newcontact.Department.sendKeys(contacts.get(i));
			i++;
			newcontact.Supervisor.sendKeys(contacts.get(i));
			i++;
			newcontact.MessengerId.sendKeys(contacts.get(i));
			i++;
			newcontact.Assistant.sendKeys(contacts.get(i));
			i++;
			newcontact.SkypeId.sendKeys(contacts.get(i));
			i++;
			newcontact.RefferedBy.sendKeys(contacts.get(i));
			i++;
			newcontact.Identifier.sendKeys(contacts.get(i));
		//	System.out.println(mapprovide.excelreader1);
		//	List textdet=mapprovide.excelreader1;
			newcontact.saveandcreate.click();
		  
		}
		
		
		
		/*		
		System.out.println("textdet are : " +textdet);
		System.out.println("textdet list 0 is : " +textdet.get(0));
		String firstname=textdet.get(0).toString();
		System.out.println("firstname is : "+firstname);
		newcontact.FirstName.sendKeys(firstname);
		newcontact.Middlename.sendKeys(textdet.get(1).toString());
		newcontact.LastName.sendKeys(textdet.get(2).toString());
		newcontact.Email.sendKeys(textdet.get(3).toString());
		newcontact.AltEmail.sendKeys(textdet.get(4).toString());
		newcontact.Nickname.sendKeys(textdet.get(5).toString());
		newcontact.Company.sendKeys(textdet.get(6).toString());
		newcontact.Position.sendKeys(textdet.get(7).toString());
		newcontact.Department.sendKeys(textdet.get(8).toString());
		newcontact.Supervisor.sendKeys(textdet.get(9).toString());
		newcontact.MessengerId.sendKeys(textdet.get(10).toString());
		newcontact.Assistant.sendKeys(textdet.get(11).toString());
		newcontact.SkypeId.sendKeys(textdet.get(12).toString());
		newcontact.RefferedBy.sendKeys(textdet.get(13).toString());
		newcontact.Identifier.sendKeys(textdet.get(14).toString());
		*/
	}
	
	

}
