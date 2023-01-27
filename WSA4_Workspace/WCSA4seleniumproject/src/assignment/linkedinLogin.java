package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedinLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		Thread.sleep(2000);
		driver.findElement(By.name("session_key")).sendKeys("abcdcdfsdf");
		driver.findElement(By.name("session_password")).sendKeys("1234fssdff", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}
}
