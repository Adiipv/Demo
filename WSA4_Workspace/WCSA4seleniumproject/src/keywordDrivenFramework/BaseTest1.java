package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 implements IAutoConstant {
	 static WebDriver driver;

	public void openbrowers() throws IOException {

		Flib flib = new Flib();
		String browerValue = flib.readpropertydata(PROP_PATH, "Brower");
		String url = flib.readpropertydata(PROP_PATH, "Url");
		if (browerValue.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);

		} else if (browerValue.equals("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);

		} else {
			System.out.println("enter valid brower name");

		}

	}

	public void closeBrower() {
		driver.quit();

	}

}
