package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"))
				.sendKeys("adcdwergjnkj");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("asdfghjklzx");
		WebElement asd = driver
				.findElement(By.xpath("//button[contains(@class ,'_acan _aiit _acap _aijb _acas _aj1-')]"));
		boolean zxc = asd.isEnabled();
		System.out.println(zxc);
	}

}
