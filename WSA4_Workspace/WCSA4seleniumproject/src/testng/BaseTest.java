package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	static WebDriver driver;
    @Parameters ({"browserValue" , "url"})
	@BeforeTest
  public void setUp(String browserValue, String url) {
	  
	  if(browserValue.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get(url);
	  }
	  
	       else if(browserValue.equals("firefox"))
	       {
	       System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
           driver= new FirefoxDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get(url);
	       } 
	       else
	       {
	    	 Reporter.log("invalid browser value",true);
	       }
	       
  }
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
