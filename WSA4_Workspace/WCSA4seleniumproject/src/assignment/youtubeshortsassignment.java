package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeshortsassignment {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		  List<WebElement> shorts = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
          for(WebElement name : shorts)
          {
        	  
        	  Thread.sleep(2000);
        	  System.out.println(name.getText());
        	  
          }
	}

}
