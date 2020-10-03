package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.pages.Loginpage;

public class TestUtil extends TestBase 
{
	static Loginpage loginpage;
	public static long PAGE_LOAD_TIMEOUT=35;
	public static long IMPLICIT_WAIT=20;
	private static XSSFRow row;
//	public static Map<String,List<String>> hm;
//	public static Map<String,Map<String,String>> supermap=null;
	public static void switchtoframe()
	{
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));	
	}
	public static  List<String> excelreader() throws Exception
	{
		List data1=new LinkedList();
		System.out.println("inside multi login method");
		loginpage=new Loginpage();
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\TestData\\crmlogindetailsall.xlsx");
        XSSFWorkbook workBook1 = new XSSFWorkbook(fis1);
        XSSFSheet sheet1=workBook1.getSheet("multiplelogin");
        int rowsize=sheet1.getLastRowNum();
        System.out.println("rowsize is : "+rowsize);
        int colsize=sheet1.getRow(0).getLastCellNum();
        System.out.println("colsize is : "+colsize);
        /*
         for(int i=1;i<=rowsize;i++)
        {
        	loginpage.username.sendKeys(sheet1.getRow(i).getCell(0).getStringCellValue());
        	loginpage.password.sendKeys(sheet1.getRow(i).getCell(1).getStringCellValue());
        	System.out.println("first value is : " +sheet1.getRow(i).getCell(0).getStringCellValue());
        	System.out.println("second value is : " +sheet1.getRow(i).getCell(1).getStringCellValue());
        	loginpage.loginbutton.click();
        }
        */
        for(int i=1;i<=rowsize;i++)
        {
        	String username=(sheet1.getRow(i).getCell(0).getStringCellValue());
        	String password=(sheet1.getRow(i).getCell(1).getStringCellValue());
        	System.out.println("first value is : " +sheet1.getRow(i).getCell(0).getStringCellValue());
        	System.out.println("second value is : " +sheet1.getRow(i).getCell(1).getStringCellValue());
        	
        	data1.add(username);
        	data1.add(password);
        	//return data1;
        }
		return data1;
        
	}
	
	
	
}
		
	
	
	

