package com.back.testcases;



import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\workspace\\artcc\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/html5/drag_demo.htm");
		driver.manage().window().maximize();
		WebElement wb1=driver.findElement(By.id("bin"));
		WebElement wb2=driver.findElement(By.id("four"));
		Actions act=new Actions(driver);
act.dragAndDrop(wb2, wb1).build().perform();
	}

}
