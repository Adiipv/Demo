package pratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class managemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Point size = new Point(300, 250);
		driver.manage().window().setPosition(size);

		Dimension size2 = new Dimension(100, 120);
		driver.manage().window().setSize(size2);
         driver.quit();
	}

}
