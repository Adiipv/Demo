package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abcdcdfsdf");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234fssdff", Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
