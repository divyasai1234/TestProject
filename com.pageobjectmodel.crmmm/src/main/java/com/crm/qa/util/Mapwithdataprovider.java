package com.crm.qa.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.Test.AddNewContactTest;
import com.crm.qa.pages.Loginpage;

public class Mapwithdataprovider extends TestBase
{

	//static Mapwithdataprovider mapprovide=new Mapwithdataprovider();

	
	public static  List<String> excelreader1() throws Exception
	{
		List data1=new LinkedList();
		System.out.println("inside multi login method");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\TestData\\crmlogindetailsall.xlsx");
        XSSFWorkbook workBook1 = new XSSFWorkbook(fis);
        XSSFSheet sheet=workBook1.getSheet("multipleaddcontacts");
        System.out.println("excel is read");
        int rowsize=sheet.getLastRowNum();
        System.out.println("rowsize is : "+rowsize);
        int colsize=sheet.getRow(0).getLastCellNum();
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
        	String firstnameexcel=(sheet.getRow(i).getCell(0).getStringCellValue());
        	String Middlenameexcel=(sheet.getRow(i).getCell(1).getStringCellValue());
        	String LastName=(sheet.getRow(i).getCell(2).getStringCellValue());
        	String Email=(sheet.getRow(i).getCell(3).getStringCellValue());
        	String AltEmail=(sheet.getRow(i).getCell(4).getStringCellValue());
        	String Nickname=(sheet.getRow(i).getCell(5).getStringCellValue());
        	String Company=(sheet.getRow(i).getCell(6).getStringCellValue());
        	String Position=(sheet.getRow(i).getCell(7).getStringCellValue());
        	String Department=(sheet.getRow(i).getCell(8).getStringCellValue());
        	String Supervisor=(sheet.getRow(i).getCell(9).getStringCellValue());
        	String MessengerId=(sheet.getRow(i).getCell(10).getStringCellValue());
        	String Assistant=(sheet.getRow(i).getCell(11).getStringCellValue());
        	String SkypeId=(sheet.getRow(i).getCell(12).getStringCellValue());
        	String RefferedBy=(sheet.getRow(i).getCell(13).getStringCellValue());
        	String Identifier=(sheet.getRow(i).getCell(14).getStringCellValue());
        	
        	System.out.println("first value is : " +sheet.getRow(i).getCell(0).getStringCellValue());
        	System.out.println("second value is : " +sheet.getRow(i).getCell(1).getStringCellValue());
        	System.out.println("second value is : " +sheet.getRow(i).getCell(2).getStringCellValue());
        	
        	data1.add(firstnameexcel);
        	data1.add(Middlenameexcel);
        	data1.add(LastName);
        	data1.add(Email);
        	data1.add(AltEmail);
        	data1.add(Nickname);
        	data1.add(Company);
        	data1.add(Position);
        	data1.add(Department);
        	data1.add(Supervisor);
        	data1.add(MessengerId);
        	data1.add(Assistant);
        	data1.add(SkypeId);
        	data1.add(RefferedBy);
        	data1.add(Identifier);
        	
        	//return data1;
        }
		return data1;
        
	}

	
	
}
