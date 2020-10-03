package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.BaseClass.TestBase;

public class AddNewContact extends TestBase
{
	//dropdown
	@FindBy(xpath="//select[@name='title']")
	public static WebElement Titledropdown;
	
	@FindBy(xpath="//select[@name='category']")
	public static WebElement categorydropdown;
	
	@FindBy(xpath="//select[@name='status']")
	public static WebElement statusdropdown;
	
	@FindBy(xpath="//select[@name='suffix']")
	public static WebElement suffixdropdown;
	
	@FindBy(xpath="//select[@name='im_netowrk']")
	public static WebElement messengernetworkdropdown;
	
	@FindBy(xpath="//select[@name='source']")
	public static WebElement sourcedropdown;

	//checkboxes  
	////input[@type='radio'][@name='receive_email'][2]
	@FindBy(xpath="//input[@name='receive_email'][@value='N']")
	public static WebElement receiveemailcheckbox;
	
	////input[@name='receive_sms'][1]
	@FindBy(xpath="//input[@name='receive_sms'][@value='Y']")
	public static WebElement receivesmscheckbox;
	
	@FindBy(xpath="//input[@name='allows_call'][@value='N']")
	public static WebElement allowscallcheckbox;
	
	//textboxes
	@FindBy(xpath="//*[@id='first_name']")
	public static WebElement FirstName ;
	
	@FindBy(xpath="//*[@id='middle_initial']")
	public static WebElement Middlename ;
	
	@FindBy(xpath="//*[@id='surname']")
	public static WebElement LastName ;
	
	@FindBy(xpath="//*[@id='email']")
	public static WebElement Email ;
	
	@FindBy(xpath="//*[@id='email_alt']")
	public static WebElement AltEmail ;
	
	@FindBy(xpath="//*[@name='nickname']")
	public static WebElement Nickname ;
	
	@FindBy(xpath="//*[@name='client_lookup']")
	public static WebElement  Company;
	
	@FindBy(xpath="//*[@id='company_position']")
	public static WebElement Position ;
	
	@FindBy(xpath="//*[@id='department']")
	public static WebElement Department  ;
	
	@FindBy(xpath="//*[@name='contact_lookup_sup']")
	public static WebElement  Supervisor;
	
	@FindBy(xpath="//*[@id='im_id']")
	public static WebElement  MessengerId;
	
	@FindBy(xpath="//*[@name='contact_lookup_ass']")
	public static WebElement Assistant ;
	
	@FindBy(xpath="//*[@id='skype_id']")
	public static WebElement SkypeId ;
	
	@FindBy(xpath="//*[@name='contact_lookup_ref']")
	public static WebElement RefferedBy ;
	
	@FindBy(xpath="//*[@name='identifier']")
	public static WebElement Identifier ;
	
	@FindBy(xpath="//input[@value='Save and Create Another (same company)']")
	public static WebElement saveandcreate;
	
	@FindBy(xpath="//input[@name='image_file']")
	public static WebElement fileupload;
	
	//Page Factory Initialisatiion
	public AddNewContact()
	{
		System.out.println("inside page factory init of addnewcontact page");
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public static void contacttitle(WebElement element,int value)
	{
		System.out.println("Action1 NC");
		System.out.println("inside addnewconatct ");
		//WebElement dropdown=driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select"));
		Select s=new Select(element);
		List<WebElement> droplist=s.getOptions();
		for(int i=0;i<droplist.size();i++)
		{
			System.out.println("droplist is :" +droplist.get(i).getText());
		}
	
		s.selectByIndex(value);
		
		//category droplist
		
		
	}
	
	public static void checkbox()
	{
		System.out.println("Action2 NC");
		if(receiveemailcheckbox.isSelected()&&receivesmscheckbox.isSelected())
		{
			System.out.println("No checkbox is selected");
		}
		else
		{
			System.out.println("no checkbox is not selected");
			
			receiveemailcheckbox.click();
			receivesmscheckbox.click();
		}
		if(allowscallcheckbox.isSelected())
		{
			allowscallcheckbox.click();
			System.out.println("in if case");
			
		}
		else
		{
			System.out.println("in else case");
			allowscallcheckbox.click();
		}
		
		
	}
	
	public void filltextboxes()
	{
		System.out.println("Action3 NC");
		
		
	}
	
	public static void autotool() throws Exception
	{
		Runtime.getRuntime().exec("C:\\Users\\Divya Sai Sucharita\\Desktop\\fileupload_crmmm.exe");
		
	}
	

}
