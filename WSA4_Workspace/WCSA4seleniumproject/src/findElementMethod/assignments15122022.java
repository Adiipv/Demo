package findElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignments15122022 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");

		List<WebElement> shorts = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(2000);
		for (WebElement name : shorts) {
			String opts = name.getText();
			Thread.sleep(2000);
			System.out.println(opts);
		}
		 
		List<WebElement> shortss = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(2000);
		for (WebElement name1 : shortss) {
			String opts1 = name1.getText();
			Thread.sleep(2000);
			System.out.println(opts1);
		}
		
       driver.quit();
	}

}
