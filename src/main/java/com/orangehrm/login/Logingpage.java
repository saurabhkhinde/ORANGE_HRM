package com.orangehrm.login;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.orangehrm.util.Utility;

public class Logingpage
{
	
	@FindBy(xpath="//div[@id='divLogo']") private WebElement Logo;
	@FindBy(xpath="//div[text()='LOGIN Panel']") private WebElement Logingpanel;
	
	   public Logingpage(WebDriver driver)
		 {
			 PageFactory.initElements( driver,this);
		 }
	
		public void Verifylogo() throws EncryptedDocumentException, IOException 
		
		{
		
		  boolean explogo=Utility.excelbooleandata("Sheet1",2,5);
		  boolean actual=Logo.isDisplayed();
		  System.out.println(actual);
		  Assert.assertEquals(actual, explogo,"Logo is Displayed");
		  Reporter.log("logo verification TC is Pass",true);
		  
		}
		  
		
	   public void logingpanel() throws EncryptedDocumentException, IOException
		
		{
		
		  boolean explogo=Utility.excelbooleandata("Sheet1",2,5);
		  boolean actual=Logingpanel.isDisplayed();
		  System.out.println(actual);
		  if(actual==explogo)
		  {
			  Reporter.log("logingPanel verification TC is Pass",true);
		  }
		  else
		  {
			  Reporter.log("logingPanel verification TC is Not Pass",true);
		  }
		}	
		
		
	
	
	
	
	
	
}
