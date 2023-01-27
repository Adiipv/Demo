package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitlyWait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement user1 = driver.findElement(By.name("username"));
		user1.sendKeys("Admin");
		Thread.sleep(4000);

		WebElement user2 = driver.findElement(By.name("password"));
		user2.sendKeys("admin123");
		Thread.sleep(4000);

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.submit();

	}

}
