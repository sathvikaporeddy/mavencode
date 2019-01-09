package Basic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Globalisation {
	
	public WebDriver driver=null;
	public Properties pro;
	@Test
	public void login() throws IOException {
		
		pro=new Properties();
		FileInputStream fs= new FileInputStream("C:\\Users\\samhitha poreddy\\eclipse-workspace\\selenium\\TestNGtutorial\\src\\Basic\\data.properties");
		pro.load(fs);
		//System.out.println(pro.getProperty("username"));
		
		
		if(pro.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Work\\chromedriver.exe");
				driver= new ChromeDriver();
			driver.get(pro.getProperty("url"));
		}else if(pro.getProperty("browser").contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Work\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(pro.getProperty("url"));
		}
		
		
	}
}
