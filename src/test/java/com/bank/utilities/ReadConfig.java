package com.bank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
		File src=new File("./configurations/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		
	catch(Exception e)
		{
		System.out.println("Exception message is" +e.getMessage());
		}
		
	}
	public String getaplicationurl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getusername()
	{
		String uname=pro.getProperty("name1");
		return uname;
	}
	
	public String getpassword()
	{
		String pwd=pro.getProperty("passwordd1");
		return pwd;
	}
	
	public String getchromepath()
	{
		String chrome=pro.getProperty("chrome");
		return chrome;
	}
	public String getiepath()
	{
		String ie=pro.getProperty("ie");
		return ie;
	}
	public String getfirefox()
	{
		String ff=pro.getProperty("firefox");
		return ff;
	}
	
	
	public String day()
	{
		String ff=pro.getProperty("day");
		return ff;
	}
	
}
