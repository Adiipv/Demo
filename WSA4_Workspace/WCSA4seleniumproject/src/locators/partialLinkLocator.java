package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=be8531abq00p/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("License")).click();
	}

}
