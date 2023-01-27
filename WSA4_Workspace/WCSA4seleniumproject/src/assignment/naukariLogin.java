package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukariLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		driver.findElement(By.id("usernameField")).sendKeys("abcdcdfsdf");
		driver.findElement(By.id("passwordField")).sendKeys("1234fssdff", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
}

}
