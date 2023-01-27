package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		 WebElement ruby = driver.findElement(By.xpath("//p[.='Ruby']"));
		 Point point =ruby.getLocation();
		 int xaxis=point.getX();
		 int yaxis=point.getY();
		 
		 System.out.println(xaxis);
		 System.out.println(yaxis);
		 
		 // to perform Scrolling Operation
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  
		  // scroll Down
		  
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
}

}
