package Tpac;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestA6 {

	@Test
	public void open()
	{
		System.out.println("this is to open browser");
		
	}
	
	@Test
	public void zest()
	{
		System.out.println("this is to test browser");
		
	}
	
	@BeforeSuite
	public void suite1()
	{
		System.out.println("This is before suite");
	}
	
	
	@Test(dependsOnMethods= {"open"})
	public void aclose()
	{
		System.out.println("this it to close the browser");
	}
	
}
