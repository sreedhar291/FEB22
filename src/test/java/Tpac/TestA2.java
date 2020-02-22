package Tpac;

import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA2 {

	
	@BeforeMethod
	public void b1()
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
	
	
	
}
