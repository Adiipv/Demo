package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest1 implements pageObjectModel.IAutoConstant {
	static WebDriver driver;

	public void openBrowser() throws IOException {
		pageObjectModel.Flib flib = new pageObjectModel.Flib();

		String browserValue = flib.readPropertyData(PROP_PATH, "Brower");
		String url = flib.readPropertyData(PROP_PATH, "Url");

		if (browserValue.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}

		else if (browserValue.equals("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		} else {
			System.out.println("enter the valid browserValue!!!");
		}

	}

	public void closeBrowser() {
		driver.quit();
	}

}