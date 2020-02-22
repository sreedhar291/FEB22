package Tpac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
@Test(dataProvider="getdata")
public void open(String user, String password, String close)
{
	System.out.println("this text is"+ user);
	System.out.println("this text is"+ password);
	System.out.println("this text is"+ close);
}

@DataProvider
public Object[][] getdata()
{
Object[][] data=new Object[3][3];
data[0][0]="sreedhar";
data[0][1]="password";
data[0][2]="close";
data[1][0]="sreedhar1";
data[1][1]="password1";
data[1][2]="close1";
data[2][0]="sreedhar2";
data[2][1]="password2";
data[2][2]="close2";
return data;
	
}

}
