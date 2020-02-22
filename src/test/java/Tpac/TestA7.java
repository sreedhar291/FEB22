package Tpac;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestA7 {

	@Test
	public void main()
	{
		System.out.println("this is main");
	}
	
	@Test(enabled=false)
	public void test()
	
	{
		System.out.println("this is test");	
	}
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("This is after suite");
	}
	
	@Test
	public void last()
	
	{
		System.out.println("this is last");	
	}
	
}
