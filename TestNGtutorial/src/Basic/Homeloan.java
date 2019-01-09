package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
public class Homeloan {
	@Test
	public void MobileHomeloan() {
		System.out.println("MobileHomeloan");
		
	}
	@Test(groups= {"smoke"})
	public void WebHomeloan() {
		System.out.println("WebHomeloan");
		
	}
	@Test(enabled=false)
	public void APIHomeloan() {
		System.out.println("APIHomeloan");
		
	}
	@BeforeTest(groups= {"smoke"})
	public void BeforeTest() {
		System.out.println("BeforeTest");
		
	}
	
	@AfterTest(groups= {"reg"})
	public void AfterTest() {
		System.out.println("AfterTests");
		
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
		
	}
	

	
	
}
