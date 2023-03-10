package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScrollDownByElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.ebay.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          Thread.sleep(3000);
        WebElement element =driver.findElement(By.xpath("//a[text()='Popular Destinations']"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        
//        js.executeScript("argument[0].scrollIntoView(true)", element);
        driver.quit();
	}

}
