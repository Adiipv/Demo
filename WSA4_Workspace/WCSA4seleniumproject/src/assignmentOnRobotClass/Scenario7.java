package assignmentOnRobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("confirmBtn")).click();
		
		WebElement alljewellery = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(alljewellery).perform();
	            
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		

		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();

	}

}
