package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=34dph8j42q63");
		  WebElement status = driver.findElement(By.id("keepLoggedInCheckBox"));
		  boolean opt = status.isSelected();
		  System.out.println(opt);
		  Thread.sleep(2000);
		  status.click();
		  
		  boolean opt1 = status.isSelected();
		  System.out.println(opt1);
		  
		  
		  
		
	}

}
