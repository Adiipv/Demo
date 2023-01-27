package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runtimepolymorphism {

	public static void main(String[] args) throws InterruptedException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("which brower you want to open ?");
		String browerValue = sc.next();

		if (browerValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.Chrome.driver", "./drivers/Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.Instagram.com/");
			Thread.sleep(8000);
			driver.close();
			
		}
		else if(browerValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.Instagram.com/");
			Thread.sleep(8000);
			driver.close();
		}
		else
		{
			System.out.println("Enter valid brower name");
		}
	}
}
