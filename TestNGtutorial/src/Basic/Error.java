package Basic;

	import java.io.FileInputStream;

	import java.io.FileNotFoundException;

	import java.io.IOException;

	import java.util.Properties;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class Error {

	public WebDriver driver=null;

	public Properties prop;

	@Test
	public void InitializeDriver() throws IOException {

	Properties prop = new Properties();

	FileInputStream file = new FileInputStream("C:\\Users\\samhitha poreddy\\eclipse-workspace\\selenium\\TestNGtutorial\\src\\Basic\\data.properties");

	prop.load(file);

	String browserName = prop.getProperty("browser");

	String urlName = prop.getProperty("url");

	if(browserName.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Work\\chromedriver.exe");

	driver = new ChromeDriver();

	System.out.println("URL   " + urlName);

	driver.get(urlName);

	//driver.get("http://www.qaclickacademy.com/");

	}

	else if(browserName.equalsIgnoreCase("firefox")) {

	//firefox code

	}

	else if(browserName.equalsIgnoreCase("IE")) {

	//ie code

	}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//return driver;

	}



	}





