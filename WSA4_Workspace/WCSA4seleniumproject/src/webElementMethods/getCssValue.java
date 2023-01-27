package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement colour = driver
				.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd')]"));
		String cssproperty = colour.getCssValue("font-size");
		System.out.println(cssproperty);

	}

}
