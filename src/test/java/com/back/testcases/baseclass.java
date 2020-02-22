 package com.back.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import com.bank.utilities.ReadConfig;

public class baseclass {
	
    ReadConfig rd=new ReadConfig();
	public String urll=rd.getaplicationurl() ;
	public String uname=rd.getusername();
	public String pwd=rd.getpassword();
	public static WebDriver driver;
	public static Logger log;
	
	public String str;
	public void screen(String str) throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\screen\\"+str+".png"));
	}
	
	@BeforeClass
	public void setup()
	{
		
		
		System.setProperty("webdriver.chrome.driver",rd.getchromepath());
		driver=new ChromeDriver();
	}
	
	
	
}
