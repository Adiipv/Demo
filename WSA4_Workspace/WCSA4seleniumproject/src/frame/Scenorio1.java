package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenorio1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("87894654");
		Thread.sleep(2000);
		driver.findElement(By.className("sd-icon-delete-sign")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.name("keyword")).sendKeys("toys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
