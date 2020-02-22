package com.bank.utilities;




import java.io.File;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;

 

import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;

import org.testng.ITestResult;

import org.testng.TestListenerAdapter;

 

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.markuputils.ExtentColor;

import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

 

//Listener class used to generate extent reports

 

public class Reporting extends TestListenerAdapter {

 

public WebDriver driver;

 

 

public ExtentHtmlReporter htmlReporter;

public ExtentReports extent; //to create entries/add info to the report

public ExtentTest logger;

 

public void onStart(ITestContext testcontext)

{

String timestamp=new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new Date()); //time stamp

String repname="Test-Report-"+timestamp+".html";

 


 htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repname); //specify location

htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/TestNG.xml");

 

        extent=new ExtentReports();

 

extent.attachReporter(htmlReporter); //attaching to the reporter

 

extent.setSystemInfo("Hostname", "Sreedhar");

extent.setSystemInfo("OS", "Windows 8.1");

extent.setSystemInfo("Tester Name", "sreedhar.e");

extent.setSystemInfo("Browser", "IE");

 

htmlReporter.config().setDocumentTitle("InetBanking Test Project"); //title of the report

htmlReporter.config().setReportName("Functional Test Report"); //Name of the report

htmlReporter.config().setTheme(Theme.DARK); //theme for the report (GUI)

}

 

public void onTestSuccess(ITestResult tr)

{

logger=extent.createTest(tr.getName()); //create new entry in the report

logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); //send the passed information

}

 

public void onTestFailure(ITestResult tr)

{

logger=extent.createTest(tr.getName()); //create new entry in the report

logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED)); //send the fail information

 

String ScreenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";

 

File f=new File(ScreenshotPath);

 

if(f.exists())

{

  try {

   logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(ScreenshotPath));

      }

  catch (IOException e)

  {

   e.printStackTrace();

  }

 }

}

 

public void onTestSkipped(ITestResult tr)

{

logger=extent.createTest(tr.getName()); //create new entry in the report

logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));

}

 

public void onFinish(ITestContext testContext)

{

extent.flush();

}

 

}