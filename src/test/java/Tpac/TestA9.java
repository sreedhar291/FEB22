package Tpac;

import org.testng.annotations.Test;

public class TestA9 {
	
	@Test
	public void open()
	{
		System.out.println("Execute the Test1");
	}
	
	@Test(groups={"Priority"})
	public void perform()
	{
		System.out.println("Execute the Test2");
		
	}
	
	@Test(groups= {"Priorit"})
	public void close()
	{
		System.out.println("Execute the Test3");
		
	}
	
	
	
	

}
