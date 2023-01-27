package findElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsusingforeachloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("maggi");
		
		Thread.sleep(2000);
		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		 
		 for(WebElement wb : suggestions )
		 {
			 Thread.sleep(2000);
			System.out.println(wb.getText()); 
		 }
		 
		 driver.quit();
	}

}
