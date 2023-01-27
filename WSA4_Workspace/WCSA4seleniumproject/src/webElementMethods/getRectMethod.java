package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");

		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Rectangle apv = download.getRect();
		int xaxis = apv.getX();
		int yaxis = apv.getY();
		int  as= apv.getHeight();
		int  az = apv.getWidth();
		System.out.println(xaxis + " : is the x axis  And " + yaxis + " : is the yaxis " + as +": is the height "  +  az  + " : is the width");
        driver.quit();
	}

}
