package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetsizeStposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Point targetsize = new Point(30,150);
         
		driver.manage().window().setPosition(targetsize);
		Thread.sleep(3000);
		
		
        Dimension targetsize1 = new Dimension(450, 230);
		
		driver.manage().window().setSize(targetsize1);
		Thread.sleep(3000);
		driver.close();

	}

}
