package com.back.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	WebDriver ldriver;

		
		public login(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
			
		}
		@FindBy(name="uid")
		WebElement uname;
		
		@FindBy(name="password")
		WebElement paswd;
		
		@FindBy(name="btnLogin")
		WebElement submit;
		
		@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
		WebElement logout;
		
		@FindBy(className="ui-state-default")
		List<WebElement> date;
		
		
		public void loginn(String st)
		{
			uname.sendKeys(st);
			
		}
		public void pwd(String pw)
		{
			paswd.sendKeys(pw);
			
		}
		public void submit()
		{
			submit.click();
			
		}
		
		public void lout()
		{
			logout.click();
			
		}
		
		public List<WebElement> date1()
		{
			return date;
			
			
			
		}
	}

