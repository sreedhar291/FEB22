package com.back.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.back.pageobject.login;
import com.bank.utilities.ReadConfig;

public class date extends  baseclass {

	
	@Test
	public void date1() throws InterruptedException, IOException
	{
		login ln=new login(driver);
		baseclass bs=new baseclass();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ReadConfig rd=new ReadConfig();
		driver.get("https://www.spicejet.com/");
		bs.screen("sree");
		

	
		
driver.findElement(By.className("ui-datepicker-trigger")).click();
bs.screen("sree1");
Thread.sleep(2000);
int iy=ln.date1().size();
System.out.println(iy);
for(int j=0;j<=iy;j++)
{
	
	
	String tere=ln.date1().get(j).getText();
	if(tere.equalsIgnoreCase(rd.day()))
{
	System.out.println(tere);
	ln.date1().get(j).click();
	}

}

	}
}
	
	

