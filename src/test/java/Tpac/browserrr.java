package Tpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browserrr {
	WebDriver driver=null;
@BeforeMethod
public void open()
{
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	
}
@Test
public void test()
{
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");

}
@Test
public void test1()
{
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium test1");

}
@Test
public void test2()
{
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium test2");

}
@Test
public void test3()
{
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium test3");

}
@AfterMethod
public void close()
{
	driver.quit();
}

}
