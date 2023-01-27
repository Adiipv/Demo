package windowMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement opt = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		opt.click();
		opt.sendKeys("iphone 14 pro max", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> Allwin = driver.getWindowHandles();

		for (String st : Allwin) {
			driver.switchTo().window(st);
		}
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[4]")).click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411021");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
