package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitlyWait
		
		driver.get("http://127.0.0.1/login.do;jsessionid=51v657juf6koa");
		
		 WebElement usernameTextBox = driver.findElement(By.name("username"));
		 WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		 usernameTextBox.sendKeys("Admin");
		 passwordTextBox.sendKeys("manager");
		 Thread.sleep(2000);
		 usernameTextBox.clear();
		 passwordTextBox.clear();

}
}