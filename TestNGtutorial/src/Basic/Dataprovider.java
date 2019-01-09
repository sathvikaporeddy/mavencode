package Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider
	public Object[][] data() {
		Object[][] data= new Object[2][2];
		data[0][0]="first";
		data[0][1]="second";
		data[1][0]="third";
		data[1][1]="fourth";
		
		return data;
	}
	
	@Test(dataProvider="data")
	public void sample(String un,String ps)
	{
		System.out.println("testing");
		System.out.println(un);
		System.out.println(ps);
	}
}
