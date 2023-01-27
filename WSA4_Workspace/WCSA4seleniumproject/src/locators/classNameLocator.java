package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(12000);
		driver.close();

	}

}
