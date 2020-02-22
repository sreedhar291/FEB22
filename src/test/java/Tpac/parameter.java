package Tpac;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Test
	@Parameters({"user"})
	public void open(String name)
	{
		System.out.println(name);
	}
	
}
