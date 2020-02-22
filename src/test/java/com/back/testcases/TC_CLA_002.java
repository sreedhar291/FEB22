package com.back.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.back.pageobject.login;
import com.bank.utilities.XLutils;



public class TC_CLA_002 extends baseclass{

	
	@Test(dataProvider="Login")
	public void loginn(String user, String pwd)
	{
		login ln=new login(driver);
		ln.loginn(user);
		ln.pwd(pwd);
		ln.submit();
		
		if(aboutalert()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			log.info("invalid details");
		}
		
		else
		{
			Assert.assertTrue(true);
			ln.lout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			log.info("valid details");
		}
	}
	
	public boolean aboutalert()
	{
		try
		{
			driver.switchTo().alert();
			return true;
			
		}
		catch(NoAlertPresentException e){
			return false;
		}
	}
	
	@DataProvider(name="Login")
	String[][] getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/bank/testdata/data.xlsx";
		int rownum=XLutils.getRowCount(path,"Sheet1");
		int colcount=XLutils.getCellCount(path,"Sheet1",1);
		
		String login1[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				login1[i-1][j]=XLutils.getcelldata(path,"Sheet1",i,j);
				}
		}
		return login1;
	}
			
	
}
