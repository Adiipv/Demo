package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AsssignmentOnSeleniumDevSite {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement dropdownelement = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(dropdownelement).perform();

		Robot rob = new Robot();
		 for(int i=1;i<11;i++) {
			
			rob.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(500);
			rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		 
		 rob.keyPress(KeyEvent.VK_ENTER);
		 rob.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_F);
		 
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyRelease(KeyEvent.VK_F);
		 
		 
		//
	}

}
