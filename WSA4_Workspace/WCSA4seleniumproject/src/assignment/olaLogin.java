package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class olaLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.olacabs.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("sso__phone")).sendKeys("1234567890", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
