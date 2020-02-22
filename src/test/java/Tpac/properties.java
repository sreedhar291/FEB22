package Tpac;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties {

	
	@Test
	public void open() throws IOException
	{
		Properties p=new Properties();
				FileInputStream fis=new FileInputStream("C:\\workspace\\TestNGG\\src\\Tpac\\fil1.properties");
	p.load(fis);
	
	System.out.println(p.getProperty("password"));
	}
}
 