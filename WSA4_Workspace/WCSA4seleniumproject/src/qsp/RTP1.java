package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the name of the brower you want to open!!");
		String BrowerValue = ref.next();

		if (BrowerValue.equalsIgnoreCase("Chrome")) { // implementation to open chrome brower
			
			System.setProperty("webdriver.Chrome.driver", "./drivers/Chromedriver.exe"); // to avoid illegalStateException
			driver = new ChromeDriver(); // to launch chrome brower
																							
			Options man = driver.manage();
			Window win = man.window();
			win.minimize(); // to minimize the window
			win.maximize(); // to maximize the window
			driver.get("https:/www.Instagram.com/");// to launch web application
			Thread.sleep(4000); // to provide the delay of 4 sec for script
			driver.close(); // to close the window
		} 
		else if (BrowerValue.equalsIgnoreCase("FireFOx")) {
			
			System.setProperty("webdriver.Firefox.driver", "./drivers/geckodriver.exe ");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();

		}
		else
		{
			System.out.println("Enter valid brower name");
		}

	}

}
