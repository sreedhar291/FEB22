package com.back.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demo {

	@Test
	public void logi()
	{
		 
		System.out.println("this is amazon site");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/test.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("logintest");
		logger.log(Status.INFO,"logged innto amazon");
		logger.log(Status.PASS,"URL opened");
		extent.flush();
		
	}

}
