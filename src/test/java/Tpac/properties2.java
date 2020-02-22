package Tpac;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class properties2 {
	WebDriver driver =null;
	
	

	@Test
	public void open() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\workspace\\TestNGG\\src\\Tpac\\browser.properties");
	p.load(fis);
	
	if(p.getProperty("browser").equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	driver =new FirefoxDriver();
	//driver.get(p.getProperty("url"));

	}
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	driver.get(p.getProperty("url"));
	}
	
	
}
