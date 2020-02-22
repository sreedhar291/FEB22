package Tpac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA4 {

	
	@BeforeMethod
	public void m1()
	{
		System.out.println("This is main method");
	}
	
	@Test
	public void open()
	{
		System.out.println("this is open test");
	}
	@Test
	public void close()
	{
		System.out.println("this is close test");
	}
	
	@BeforeTest
	public void t1()
	{
		System.out.println("this is before test");
	}
	@AfterTest
	public void t2()
	{
		System.out.println("this is after test");
	}
	@AfterMethod
	public void m2()
	{
		System.out.println("This is last method");
	}
	
}
