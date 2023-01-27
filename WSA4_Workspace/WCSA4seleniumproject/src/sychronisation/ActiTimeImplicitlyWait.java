package sychronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeImplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=34dph8j42q63");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualLoginPagetitle =  driver.getTitle();
		if( actualLoginPagetitle.equals("actiTIME - Login"))
		{
			System.out.println("Login Page TITLE IS MATCH :TEST IS PASSED");
		}
		else 
		{
			System.out.println("Login page TITLE IS MATCH :TEST IS FAILED ");
		}
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String actualHomePagetitle2 =  driver.getTitle();
		if( actualHomePagetitle2.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home Page TITLE IS MATCH :TEST IS PASSED");
		}
		else 
		{
			System.out.println("Home page TITLE IS MATCH :TEST IS FAILED ");
		}
		driver.quit();
		
		
	
		

	}

}
