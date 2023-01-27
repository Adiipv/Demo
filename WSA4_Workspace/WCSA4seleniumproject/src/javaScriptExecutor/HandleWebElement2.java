package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebElement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("C:\\Users\\Dell\\OneDrive\\Desktop\\WCAS4\\disabledTextbox.html");

		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (username.isEnabled()) 
		{
			username.sendKeys("manager");
			System.out.println("if block is executed 1");
		} 
		else 
		{
			
			Thread.sleep(2000);
			js.executeScript("document.getElementById('i1').value='manager'");
			System.out.println("elseblock is executed 1 ");
		}
		if (password.isEnabled()) 
		{
			password.sendKeys("123");
			System.out.println("if block is executed 2" );
		} 
		else
		{
			
			Thread.sleep(2000);
			js.executeScript("document.getElementById('i2').value='123'");
			System.out.println("elseblock is executed 2");
		}

		
	}
}
