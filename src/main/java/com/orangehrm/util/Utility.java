package com.orangehrm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
     static Workbook wbf;
    static  FileInputStream f;
	public static String StringData(String SheetName,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException
	{
		 f= new FileInputStream("C:\\eclipsefile\\SeleniumAugust2022\\TestData\\TEST2.xlsx");
	    wbf=WorkbookFactory.create(f);
	    String data = wbf.getSheet(SheetName).getRow(rownumber-1).getCell(cellnumber-1).getStringCellValue();
        return data;
	   	    
	}
	
	
	public static boolean excelbooleandata(String SheetName,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException	
	{
		f= new FileInputStream("C:\\eclipsefile\\SeleniumAugust2022\\TestData\\TEST2.xlsx");
	    wbf=WorkbookFactory.create(f);
		
	    boolean data = wbf.getSheet(SheetName).getRow(rownumber-1).getCell(cellnumber-1).getBooleanCellValue();
        return data;
	
	}
	
	public static void screenshot(WebDriver driver) throws IOException 
	
	{
		TakesScreenshot ts = (TakesScreenshot)driver;//typecast
		File source = ts.getScreenshotAs(OutputType.FILE);

		Date d= new Date();
		    
		String timestamp = d.toString().replace(":", "_").replace(" ", "_");
			
		//File destination= new File("C:\\eclipsefile\\SeleniumAugust2022\\ScreenShots\\"+timestamp+".jpg");
		
		File destination= new File(System.getProperty("user.dir")+"\\ScreenShots\\"+timestamp+".jpg");
	
		FileHandler.copy(source,destination);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
