package testngAssert;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	@Parameters("browserValue")
	@Test

	public void openBrowser(String browser) {
		WebDriver driver = null;

		switch (browser) {
		case "chrome": {
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().activeElement().sendKeys("sql", Keys.ENTER);
			driver.quit();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().activeElement().sendKeys("manual", Keys.ENTER);
			driver.quit();
			break;
		}
		case "edge": {
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
			driver.quit();
			break;
		}
		default:
			System.out.println("invalid");
		}

	}
}
