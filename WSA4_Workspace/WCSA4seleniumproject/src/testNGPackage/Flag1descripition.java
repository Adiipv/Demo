package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flag1descripition {
	WebDriver driver;
  @Test(description = "This is test case for sql")//next to annotation TestNG flags
  
  public void sql() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  
	  
  }
}

