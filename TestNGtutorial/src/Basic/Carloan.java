package Basic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Carloan {
	@Parameters({"url","uname"})
	@Test(dependsOnMethods= {"Webcarloan"})
	public void Mobilecarloan(String name, String uname) {
		System.out.println("Mobilecarloan");
		System.out.println(name);
		System.out.println(uname);
		
	}
	@Test(timeOut=4000)
	public void Webcarloan() {
		System.out.println("Webcarloan");
		
	}
	@Test(groups= {"smoke"})
	public void APIcarloan() {
		System.out.println("APIcarloan");
		
	}
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
		
	}
	@AfterSuite(groups= {"reg"})
	public void AfterSuite() {
		System.out.println("AfterSuite");
		
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
		
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		
	}
}
