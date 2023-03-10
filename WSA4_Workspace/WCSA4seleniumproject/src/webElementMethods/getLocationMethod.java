package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
		
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Point Loc = download.getLocation();
		int xaxis = Loc.getX();
		int yaxis = Loc.getY();
		System.out.println(xaxis + " : is the x axis  And " +  yaxis + " : is the yaxis ");
	}
}
