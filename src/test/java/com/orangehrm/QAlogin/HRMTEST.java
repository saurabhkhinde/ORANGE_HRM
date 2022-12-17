package com.orangehrm.QAlogin;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.login.Logingpage;
import com.orangehrm.util.Utility;

 public class HRMTEST 
   {


	@Test
	public void browserlaunch() throws InterruptedException, EncryptedDocumentException, IOException 
		{
		     
			System.setProperty("webdriver.chrome.driver", "C:\\eclipsefile\\SeleniumAugust2022\\Softwares\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://training.orangehrm.com/");
			Thread.sleep(2000);
			
			
		
		
	 Logingpage l=new Logingpage(driver);	
	    l.Verifylogo();
	    l.logingpanel();
	    
	     driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
	
	
	
}
