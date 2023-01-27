package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentonflipkartusingxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop", Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[.='Core i7'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (.='HP')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@title='Windows 10']")).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(value + " is the price of hp laptop");
		driver.quit();
	}

}
