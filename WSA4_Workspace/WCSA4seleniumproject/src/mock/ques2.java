package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("adcdwergjnkj");
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("asdfghjklzx");
        driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]")).click();
        Thread.sleep(4000);
        driver.quit();
	}

}
