package sychronisation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=5a17scrpcl8b4");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean opt = wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(opt);
		driver.quit();
		
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	    Boolean opt2 = wait2.until(ExpectedConditions.titleContains("homepage"));
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    Boolean opt4 = wait3.until(ExpectedConditions.titleContains(""));
	    
	    WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
	       Boolean check1 = wait4.until(ExpectedConditions.titleContains(""));

	}

}
