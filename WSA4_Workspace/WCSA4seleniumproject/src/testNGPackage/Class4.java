package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class4 {
	WebDriver driver;
	  @Test()
	  
	  public void automation() {
		  
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		  driver.quit();
		  
	  }
	}