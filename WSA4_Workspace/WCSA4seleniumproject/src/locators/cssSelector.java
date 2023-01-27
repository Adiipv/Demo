package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abcdcdfsdf");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234fssdff");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='_acan _acap _acas']")).click(); // initial value 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class$=' _acas']")).click(); /// last value
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='_acap ']")).click();/// middle value
		Thread.sleep(2000);
		driver.close();
	}
	

}
