package pomPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginTest {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		
		if(login.getLogo().isDisplayed())
			System.out.println("login page displayed");
		else
			System.out.println("login page is not displayed");
		
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickCheckbox();
		login.clickLoginButton();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		if(wait.until(ExpectedConditions.titleContains("Enter Time-Track")))
			System.out.println("home page is displayed");
		else
			System.out.println("home is not displayed");
		
		
		driver.quit();
		
		
	}

}
