package mock;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        Point opt1 = new Point(100,200);
        driver.manage().window().setPosition(opt1);
        
        Thread.sleep(4000);
        
        
        Dimension opt2 = new Dimension(200, 100);
        driver.manage().window().setSize(opt2);
        Thread.sleep(4000);
        driver.quit();
        
        
	}

}
