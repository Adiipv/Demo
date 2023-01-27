package sychronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=34dph8j42q63");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean check = wait.until(ExpectedConditions.titleContains("Login")); // titleContains method return type is boolean																		// boolean
		System.out.println(check);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Boolean check2 = wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		System.out.println(check2);
		driver.quit();
	}
}
