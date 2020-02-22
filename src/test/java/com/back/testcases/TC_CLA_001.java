package com.back.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.back.pageobject.login;

public class TC_CLA_001 extends baseclass{

	
	@Test
	public void logii()
	{
     driver.get(urll);
     log.info("url opened");
     login ln=new login(driver);
     ln.loginn(uname);
     log.info("enter username");
     ln.pwd(pwd);
     log.info("password entered");
     ln.submit();
     log.info("clicked on submit");
     
     if(driver.getTitle().equals("Guru99 Bank Home Page"))
     {
    	 Assert.assertTrue(true);
    	 log.info("right page");
     }
     else
     {
    	 Assert.assertTrue(false);
    	 log.info("wrong page");
     }
	}
}
