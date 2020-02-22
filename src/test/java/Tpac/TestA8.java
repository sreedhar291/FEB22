package Tpac;

import org.testng.annotations.Test;

public class TestA8 {

	@Test
	public void open()
	{
		System.out.println("this is to open browser");
		
	}
	
	@Test(timeOut=5000)
	public void zest()
	{
		System.out.println("this is to test browser");
		
	}
	
	
	@Test(dependsOnMethods= {"open"})
	public void aclose()
	{
		System.out.println("this it to close the browser");
	}
	
}
