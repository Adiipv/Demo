package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flag3inovatationCount {
	WebDriver driver;
	  @Test(invocationCount = 3)
	  
	  public void manualTesting() {
		  
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.switchTo().activeElement().sendKeys("manual testing",Keys.ENTER);
		  
		  
	  }
	}