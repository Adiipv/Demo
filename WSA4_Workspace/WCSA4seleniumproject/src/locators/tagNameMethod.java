package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/2.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("automation");

	}

}
